package com.macro.meedog.search.repository;

import com.macro.meedog.search.domain.EsEducation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;

/**
 * 人ES操作类
 * Created by macro on 2018/6/19.
 */
@EnableReactiveElasticsearchRepositories
public interface EsEducationRepository extends ElasticsearchRepository<EsEducation, Long> {
    /**
     * 搜索查询
     *
     * @param school 学校
     * @param degree 学位
     * @param page   分页信息
     * @return
     */
    Page<EsEducation> findBySchoolOrDegree(String school, Integer degree, Pageable page);

}
