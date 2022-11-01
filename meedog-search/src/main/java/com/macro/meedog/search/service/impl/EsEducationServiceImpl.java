package com.macro.meedog.search.service.impl;

import com.macro.meedog.search.domain.EsEducation;
import com.macro.meedog.search.repository.EsEducationRepository;
import com.macro.meedog.search.service.EsEducationService;
import org.apache.lucene.search.TotalHits;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.HttpAsyncResponseConsumerFactory;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.common.lucene.search.function.FunctionScoreQuery;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.index.query.*;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;


/**
 * 搜索管理Service实现类
 * Created by meedog on 2018/6/19.
 * https://segmentfault.com/a/1190000018625101
 * https://www.jianshu.com/p/de838a665eec
 * https://blog.csdn.net/wangxudongx/article/details/87275232
 * https://zhuanlan.zhihu.com/p/103056777
 * https://blog.csdn.net/paditang/article/details/78802799?utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.control&dist_request_id=1328767.1504.16172839234900977&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.control
 */
@Service
public class EsEducationServiceImpl implements EsEducationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EsEducationServiceImpl.class);
    @Resource(name = "highLevelClient")
    private RestHighLevelClient highClient;
    @Autowired
    private EsEducationRepository eduRepository;
    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Override
    public boolean existsIndex(String index) {
        GetIndexRequest request = new GetIndexRequest(index);
        boolean exists = false;
        try {
            exists = highClient.indices().exists(request, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return exists;
    }

    /**
     *
     */
    @Override
    public boolean createIndex(String index) {
        CreateIndexRequest request = new CreateIndexRequest(index);
        CreateIndexResponse createIndexResponse = null;
        try {
            createIndexResponse = highClient.indices().create(
                    request, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return createIndexResponse.isAcknowledged();
    }

    /**
     *
     */
    @Override
    public boolean deleteIndex(String index) {
        DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest(index);
        AcknowledgedResponse response = null;
        try {
            response = highClient.indices().delete(deleteIndexRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response.isAcknowledged();
    }

    @Override
    public Page<EsEducation> search(String school, Integer degree, Integer pageNum, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        LOGGER.info("wyg+ " + school);
        return eduRepository.findBySchoolOrDegree(school, degree, pageable);
    }

    @Override
    public Page<EsEducation> search(String keyword, Long uid, Integer pageNum, Integer pageSize, Integer sort) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        //分页
        nativeSearchQueryBuilder.withPageable(pageable);
        //过滤
        if (uid != null) {
            BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
            if (uid != null) {
                boolQueryBuilder.must(QueryBuilders.termQuery("uid", uid));
            }
            nativeSearchQueryBuilder.withFilter(boolQueryBuilder);
        }
        //搜索
        if (StringUtils.isEmpty(keyword)) {
            nativeSearchQueryBuilder.withQuery(QueryBuilders.matchAllQuery());
        } else {
            List<FunctionScoreQueryBuilder.FilterFunctionBuilder> filterFunctionBuilders = new ArrayList<>();
            filterFunctionBuilders.add(new FunctionScoreQueryBuilder.FilterFunctionBuilder(QueryBuilders.matchQuery("username", keyword),
                    ScoreFunctionBuilders.weightFactorFunction(10)));

            FunctionScoreQueryBuilder.FilterFunctionBuilder[] builders = new FunctionScoreQueryBuilder.FilterFunctionBuilder[filterFunctionBuilders.size()];
            filterFunctionBuilders.toArray(builders);
            FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery(builders)
                    .scoreMode(FunctionScoreQuery.ScoreMode.SUM)
                    .setMinScore(2);
            nativeSearchQueryBuilder.withQuery(functionScoreQueryBuilder);
        }
        //排序
        if (sort == 1) {
            //按新品从新到旧
            nativeSearchQueryBuilder.withSort(SortBuilders.fieldSort("height").order(SortOrder.DESC));
        } else if (sort == 2) {
            //按销量从高到低
            nativeSearchQueryBuilder.withSort(SortBuilders.fieldSort("bmi").order(SortOrder.DESC));
        } else {
            //按相关度
            nativeSearchQueryBuilder.withSort(SortBuilders.scoreSort().order(SortOrder.DESC));
        }
        nativeSearchQueryBuilder.withSort(SortBuilders.scoreSort().order(SortOrder.DESC));
        NativeSearchQuery searchQuery = nativeSearchQueryBuilder.build();
        LOGGER.info("DSL:{}", searchQuery.getQuery().toString());
        SearchHits<EsEducation> searchHits = elasticsearchRestTemplate.search(searchQuery, EsEducation.class);
        if (searchHits.getTotalHits() <= 0) {
            return new PageImpl<>(new ArrayList<>(), pageable, 0);
        }
        List<EsEducation> searchUserList = searchHits.stream().map(SearchHit::getContent).collect(Collectors.toList());
        return new PageImpl<>(searchUserList, pageable, searchHits.getTotalHits());
    }

    @Override
    public Page<EsEducation> recommend(Long id, Integer pageNum, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);


        List<FunctionScoreQueryBuilder.FilterFunctionBuilder> filterFunctionBuilders = new ArrayList<>();
        filterFunctionBuilders.add(new FunctionScoreQueryBuilder.FilterFunctionBuilder(
                ScoreFunctionBuilders.weightFactorFunction(8)));
        filterFunctionBuilders.add(new FunctionScoreQueryBuilder.FilterFunctionBuilder(QueryBuilders.matchQuery("uid", id),
                ScoreFunctionBuilders.weightFactorFunction(5)));
        FunctionScoreQueryBuilder.FilterFunctionBuilder[] builders = new FunctionScoreQueryBuilder.FilterFunctionBuilder[filterFunctionBuilders.size()];
        filterFunctionBuilders.toArray(builders);
        FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery(builders)
                .scoreMode(FunctionScoreQuery.ScoreMode.SUM)
                .setMinScore(2);

        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
        boolQueryBuilder.mustNot(QueryBuilders.termQuery("uid", id));

        NativeSearchQueryBuilder builder = new NativeSearchQueryBuilder();
        builder.withQuery(functionScoreQueryBuilder);
        builder.withFilter(boolQueryBuilder);
        builder.withPageable(pageable);
        NativeSearchQuery searchQuery = builder.build();
        LOGGER.info("DSL:{}", searchQuery.getQuery().toString());
        SearchHits<EsEducation> searchHits = elasticsearchRestTemplate.search(searchQuery, EsEducation.class);
        if (searchHits.getTotalHits() <= 0) {
            return new PageImpl<>(new ArrayList<>(), pageable, 0);
        }
        List<EsEducation> searchEducationList = searchHits.stream().map(SearchHit::getContent).collect(Collectors.toList());
        return new PageImpl<>(searchEducationList, pageable, searchHits.getTotalHits());
    }

    private void search() throws IOException {
        SearchRequest searchRequest = new SearchRequest();
        searchRequest.indices("edu");
        searchRequest.types("_doc");

        // 条件=
        MatchQueryBuilder matchQuery = QueryBuilders.matchQuery("country", "美国");
        TermQueryBuilder termQuery = QueryBuilders.termQuery("province", "纽约");
        // 范围查询
        RangeQueryBuilder timeFilter = QueryBuilders.rangeQuery("log_time").gt(12345).lt(343750);
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();

        QueryBuilder totalFilter = QueryBuilders.boolQuery()
                .filter(matchQuery)
                .filter(timeFilter)
                .mustNot(termQuery);

        int size = 200;
        int from = 0;
        TotalHits total = new TotalHits(0L, TotalHits.Relation.EQUAL_TO);

        do {
            try {
                sourceBuilder.query(totalFilter).from(from).size(size);
                sourceBuilder.timeout(new TimeValue(60, TimeUnit.SECONDS));
                searchRequest.source(sourceBuilder);
                RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
                builder.setHttpAsyncResponseConsumerFactory(
                        new HttpAsyncResponseConsumerFactory
                                .HeapBufferedResponseConsumerFactory(30 * 1024 * 1024 * 1024));
                RequestOptions requestOptions = builder.build();

                SearchResponse response = highClient.search(searchRequest, requestOptions);
                org.elasticsearch.search.SearchHit[] hits = response.getHits().getHits();
                for (org.elasticsearch.search.SearchHit hit : hits) {
                    System.out.println(hit.getSourceAsString());
                }

                total = response.getHits().getTotalHits();

                System.out.println("测试:[" + total + "][" + from + "-" + (from + hits.length) + ")");

                from += hits.length;

                // from + size must be less than or equal to: [10000]
                if (from >= 10000) {
                    System.out.println("测试:超过10000条直接中断");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (from < total.value);
    }
}