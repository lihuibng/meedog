package com.macro.meedog.search.service;

import com.macro.meedog.search.domain.EsAssetSalary;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author "xxxxxx"
 */

public interface EsAssetSalaryService {

    /**
     *
     */
    boolean existsIndex(String index);

    /**
     *
     */
    boolean createIndex(String index);

    /**
     *
     */
    boolean deleteIndex(String index);

    /**
     * 根据关键字搜索名称或者副标题
     */
    Page<EsAssetSalary> search(Integer asset,
                               Integer salary,
                               Integer deposit,
                               Integer other,
                               Integer pageNum,
                               Integer pageSize);

    /**
     * 根据关键字搜索名称或者副标题复合查询
     */
    Page<EsAssetSalary> search(Integer asset,
                               Integer salary,
                               Integer deposit,
                               Integer other,
                               Long uid, Integer pageNum, Integer pageSize, Integer sort);

    /**
     * 根据人id推荐相关人
     */
    Page<EsAssetSalary> recommend(Long uid, Integer pageNum, Integer pageSize);
}
