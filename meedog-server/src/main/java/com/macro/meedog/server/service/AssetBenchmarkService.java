package com.macro.meedog.server.service;

import com.macro.meedog.model.AssetBenchmark;
import com.macro.meedog.server.domain.vo.AssetBenchmarkVo;

import java.util.List;

/**
 * @author "xxxxxx"
 */

public interface AssetBenchmarkService {
    /**
     * getAssetBenchmarks
     *
     * @return List<AssetBenchmark>
     */
    List<AssetBenchmark> getAssetBenchmarks();

    /**
     * insertAssetBenchmark
     *
     * @param benchmark
     * @return int
     */
    int insertAssetBenchmark(AssetBenchmark benchmark);

    /**
     * updateAssetBenchmark
     *
     * @param benchmark
     * @return UserBasicInfo
     */
    int updateAssetBenchmark(AssetBenchmark benchmark);


    /**
     * getAssetBenchmarkById
     *
     * @param id
     * @return AssetBenchmark
     */
    List<AssetBenchmarkVo> getAssetBenchmarkById(Long id);

    /**
     * getAssetBenchmarkByCityId
     *
     * @param cityId
     * @return AssetBenchmark
     */
    AssetBenchmark getAssetBenchmarkByCityId(Long cityId);

    /**
     * deleteAssetBenchmark
     *
     * @param id
     * @return int
     */
    int deleteAssetBenchmark(Long id);

    /**
     * clear
     *
     * @param
     * @return int
     */
    int clear(Long id);
}

