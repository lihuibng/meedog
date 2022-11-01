package com.macro.meedog.search.service.impl;

import cn.hutool.core.date.DateRange;
import com.macro.meedog.common.date.DateUtil;
import com.macro.meedog.common.json.JsonUtils;
import com.macro.meedog.search.config.ElasticSearchConfig;
import com.macro.meedog.search.domain.EsUser;
import com.macro.meedog.search.domain.SearchParam;
import com.macro.meedog.search.repository.EsUserRepository;
import com.macro.meedog.search.service.EsUserService;
import org.apache.commons.lang.StringUtils;
import org.apache.lucene.search.TotalHits;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.HttpAsyncResponseConsumerFactory;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.index.query.*;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * 搜索管理Service实现类
 * author: meedog
 * Created by meedog on 2018/6/19.
 * https://segmentfault.com/a/1190000018625101
 * https://www.jianshu.com/p/de838a665eec
 * https://blog.csdn.net/wangxudongx/article/details/87275232
 * https://zhuanlan.zhihu.com/p/103056777
 * https://blog.csdn.net/paditang/article/details/78802799?utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.control&dist_request_id=1328767.1504.16172839234900977&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.control
 */
@Service
public class EsUserServiceImpl implements EsUserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EsUserServiceImpl.class);
    @Autowired
    ElasticSearchConfig elasticSearchConfig;
    @Resource(name = "highLevelClient")
    private RestHighLevelClient highClient;
    @Autowired
    private EsUserRepository userRepository;
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



    /*
    @Override
    public Page<EsUser> search(SearchParam searchParam, Integer pageNum, Integer pageSize, Integer sort) {
        LOGGER.info("wyg+ " + searchParam.getKeyword() + " " + searchParam.getUid());
        Pageable pageable = PageRequest.of(pageNum, pageSize);

        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        //分页
        nativeSearchQueryBuilder.withPageable(pageable);
        //过滤
        if (searchParam.getUid() != null) {
            BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
            if (searchParam.getUid() != null) {

                boolQueryBuilder.must(QueryBuilders.termQuery("uid", searchParam.getUid()));
            }
            nativeSearchQueryBuilder.withFilter(boolQueryBuilder);
        }
        //搜索
        if (searchParam.getKeyword() == null || searchParam.getKeyword().isEmpty()) {
            nativeSearchQueryBuilder.withQuery(QueryBuilders.matchAllQuery());
        } else {
            List<FunctionScoreQueryBuilder.FilterFunctionBuilder> filterFunctionBuilders = new ArrayList<>();
            filterFunctionBuilders.add(
                    new FunctionScoreQueryBuilder.FilterFunctionBuilder(
                            QueryBuilders.matchQuery("username", searchParam.getKeyword()),
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
        SearchHits<EsUser> searchHits = elasticsearchRestTemplate.search(searchQuery, EsUser.class);

        if (searchHits.getTotalHits() <= 0) {
            return new PageImpl<>(new ArrayList<EsUser>(), pageable, 0);
        }
        LOGGER.info("searchHits:{}", searchHits.toString());
        //List<EsUser> searchUserList = searchHits.stream().map(SearchHit::getContent).collect(Collectors.toList());
        //List<EsUser> searchUserList = new ArrayList<>();
        List<EsUser> searchUserList = searchHits.getSearchHits().stream().map(SearchHit::getContent).collect(Collectors.toList());

        for (EsUser e : searchUserList) {
            if (e != null ) {
                LOGGER.info("searchHits:{}", e.toString());
            }
        }
        return new PageImpl<>(searchUserList, pageable, searchHits.getTotalHits());

    }

    @Override
    public Page<EsUser> recommend(Long id, Integer pageNum, Integer pageSize) {
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
        SearchHits<EsUser> searchHits = elasticsearchRestTemplate.search(searchQuery, EsUser.class);
        if (searchHits.getTotalHits() <= 0) {
            return new PageImpl<>(new ArrayList<>(), pageable, 0);
        }
        List<EsUser> searchUserList = searchHits.stream().map(SearchHit::getContent).collect(Collectors.toList());
        return new PageImpl<>(searchUserList, pageable, searchHits.getTotalHits());
    }*/

    private RequestOptions buildRequest(String index,
                                        SearchParam param,
                                        SearchRequest req,
                                        int from,
                                        int size,
                                        int timeout) {
        RequestOptions options = RequestOptions.DEFAULT;
        req.indices(index);
        req.searchType(SearchType.DFS_QUERY_THEN_FETCH);
        MatchQueryBuilder keywordQuery = null;
        TermQueryBuilder marriageStatusQuery = null;
        RangeQueryBuilder degreeFilter = null;
        RangeQueryBuilder ageFilter = null;
        RangeQueryBuilder heightFilter = null;
        RangeQueryBuilder salaryFilter = null;
        TermsQueryBuilder districtsQuery = null;
        TermQueryBuilder householdsQuery = null;
        TermsQueryBuilder collegeStatusQuery = null;
        TermsQueryBuilder constellationsQuery = null;
        TermsQueryBuilder zodiacQuery = null;
        if (StringUtils.isNotBlank(param.getKeyword())) {
            keywordQuery = QueryBuilders.matchQuery("keyword", param.getKeyword());
        } else {
            keywordQuery = QueryBuilders.matchQuery("keyword", "*");
        }
        if (param.getMarriages() != null) {
            marriageStatusQuery = QueryBuilders.termQuery("marriageStatus", param.getMarriages());
        } else {
            marriageStatusQuery = QueryBuilders.termQuery("marriageStatus", 0);
        }
        if (param.getMarriages() != null) {
            degreeFilter = QueryBuilders.rangeQuery("degree").gte(param.getDegrees());
        } else {
            degreeFilter = QueryBuilders.rangeQuery("degree").gte(7);
        }
        if (param.getAgeHigh() != null && param.getAgeLow() != null) {
            Date birthDayLow = DateUtil.age2Date(-param.getAgeHigh(), 0, 0);
            Date birthDayHigh = DateUtil.age2Date(-param.getAgeLow(), 0, 0);
            ageFilter = QueryBuilders.rangeQuery("birthday")
                    .from(birthDayLow)
                    .to(birthDayHigh)
                    .format("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        } else {
            Date birthDayLow = DateUtil.age2Date(-50, 0, 0);
            Date birthDayHigh = DateUtil.age2Date(-20, 0, 0);
            ageFilter = QueryBuilders.rangeQuery("birthday")
                    .from(birthDayLow)
                    .to(birthDayHigh)
                    .format("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        }
        if (param.getHeightLow() != null && param.getHeightHigh() != null) {
            heightFilter = QueryBuilders.rangeQuery("height")
                    .gte(param.getHeightLow())
                    .lte(param.getHeightHigh());
        } else {
            heightFilter = QueryBuilders.rangeQuery("height").gte(130).lte(220);
        }
        if (param.getSalaryValue() != null) {
            salaryFilter = QueryBuilders.rangeQuery("salary").gte(param.getSalaryValue() * 100 / 40);
        } else {
            salaryFilter = QueryBuilders.rangeQuery("salary").gte(0);
        }
        if (!CollectionUtils.isEmpty(param.getDistricts())) {
            districtsQuery = QueryBuilders.termsQuery("district", param.getDistricts());
        } else {
            districtsQuery = QueryBuilders.termsQuery("district", new ArrayList<>());
        }
        if (!CollectionUtils.isEmpty(param.getHouseholds())) {
            householdsQuery = QueryBuilders.termQuery("household", param.getHouseholds());
        } else {
            householdsQuery = QueryBuilders.termQuery("household", new ArrayList<>());
        }
        if (!CollectionUtils.isEmpty(param.getCollegeStatus())) {
            collegeStatusQuery = QueryBuilders.termsQuery("collegeStatus", param.getCollegeStatus());
        } else {
            collegeStatusQuery = QueryBuilders.termsQuery("collegeStatus", new ArrayList<>());
        }
        if (!CollectionUtils.isEmpty(param.getConstellations())) {
            constellationsQuery = QueryBuilders.termsQuery("constellation", param.getConstellations());
        } else {
            constellationsQuery = QueryBuilders.termsQuery("constellation", new ArrayList<>());
        }
        if (!CollectionUtils.isEmpty(param.getZodiacs())) {
            zodiacQuery = QueryBuilders.termsQuery("zodiac", param.getZodiacs());
        } else {
            zodiacQuery = QueryBuilders.termsQuery("zodiac", new ArrayList<>());
        }
        QueryBuilder totalFilter = QueryBuilders.boolQuery()
                .must(marriageStatusQuery);
                //.must(degreeFilter)
                //.must(ageFilter)
                //.must(heightFilter)
                //.must(salaryFilter)
                //.must(districtsQuery)
                //.must(householdsQuery)
                //.must(collegeStatusQuery)
                //.must(constellationsQuery)
                //.must(zodiacQuery)
                //.must(keywordQuery);
        LOGGER.info("query builder: " + totalFilter.toString());
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        try {
            sourceBuilder.query(totalFilter).from(from).size(size)
                    .sort("salary", SortOrder.DESC)
                    .sort("height", SortOrder.DESC)
                    .sort("degree", SortOrder.DESC)
                    .sort("_score", SortOrder.ASC)
                    .explain(true);
            LOGGER.info("source builder: " + sourceBuilder.toString());
            sourceBuilder.timeout(new TimeValue(timeout, TimeUnit.SECONDS));
            req.source(sourceBuilder);
            RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
            builder.setHttpAsyncResponseConsumerFactory(
                    new HttpAsyncResponseConsumerFactory
                            .HeapBufferedResponseConsumerFactory(1024 * 1024 * 1024));
            return builder.build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return options;
    }

    @Override
    public Page<EsUser> search(SearchParam searchParam, Integer pageNum, Integer pageSize, Integer sort) {
        LOGGER.info("param: " + searchParam.toString());
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        int from = 0, size = elasticSearchConfig.getMaxPerSearchResults();
        TotalHits total = new TotalHits(0L, TotalHits.Relation.EQUAL_TO);
        List<EsUser> searchUserList = new ArrayList<>();
        do {
            try {
                SearchRequest searchRequest = new SearchRequest();
                RequestOptions option = buildRequest("user", searchParam, searchRequest, from, size, 120);
                LOGGER.info("search request: " + searchRequest.toString());
                SearchResponse response = highClient.search(searchRequest, option);
                org.elasticsearch.search.SearchHit[] hits = response.getHits().getHits();
                LOGGER.info("searchhit : " + hits.toString());
                for (org.elasticsearch.search.SearchHit hit : hits) {
                    searchUserList.add(JsonUtils.fromJson(hit.getSourceAsString(), EsUser.class));
                }
                from += hits.length;
                if (from >= elasticSearchConfig.getMaxSearchResults()) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (from < total.value);
        LOGGER.info("searchhit : " + searchUserList.toString());
        return new PageImpl<>(searchUserList, pageable, total.value);
    }
}