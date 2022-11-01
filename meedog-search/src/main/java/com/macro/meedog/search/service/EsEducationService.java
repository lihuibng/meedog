package com.macro.meedog.search.service;

import com.macro.meedog.search.domain.EsEducation;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author "xxxxxx"
 */
public interface EsEducationService {

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
    Page<EsEducation> search(String school, Integer degree, Integer pageNum, Integer pageSize);

    /**
     * 根据关键字搜索名称或者副标题复合查询
     */
    Page<EsEducation> search(String school, Long uid, Integer pageNum, Integer pageSize, Integer sort);

    /**
     * 根据人id推荐相关人
     */
    Page<EsEducation> recommend(Long uid, Integer pageNum, Integer pageSize);

}
