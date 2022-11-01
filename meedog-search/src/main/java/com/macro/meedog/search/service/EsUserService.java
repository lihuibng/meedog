package com.macro.meedog.search.service;

import com.macro.meedog.search.domain.EsUser;
import com.macro.meedog.search.domain.SearchParam;
import io.micrometer.core.instrument.search.Search;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author "xxxxxx"
 */
public interface EsUserService {

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
    // Page<EsUser> search(String keyword, Integer pageNum, Integer pageSize);

    /**
     * 根据关键字搜索名称或者副标题复合查询
     */
    // Page<EsUser> search(SearchParam searchParam, Integer pageNum, Integer pageSize, Integer sort);

    /**
     * 根据人id推荐相关人
     */
    // Page<EsUser> recommend(Long uid, Integer pageNum, Integer pageSize);

    /**
     * 根据关键字搜索名称或者副标题复合查询
     */
    Page<EsUser> search(SearchParam searchParam, Integer pageNum, Integer pageSize, Integer sort);
}
