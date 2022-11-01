package com.macro.meedog.search.repository;

import com.macro.meedog.search.domain.EsAssetSalary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;

/**
 * 人ES操作类
 * Created by macro on 2018/6/19.
 */
@EnableReactiveElasticsearchRepositories
public interface EsAssetSalaryRepository extends ElasticsearchRepository<EsAssetSalary, Long> {
    /**
     * 搜索查询
     *
     * @param asset   房产
     * @param salary  收入
     * @param deposit 存款
     * @param other   其他
     * @return
     */
    Page<EsAssetSalary> findByAssetOrSalaryOrOther(Integer asset,
                                                   Integer salary,
                                                   Integer deposit,
                                                   Integer other,
                                                   Pageable page);

}
