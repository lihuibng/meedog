package com.macro.meedog.mapper;

import com.macro.meedog.model.AssetBenchmark;
import com.macro.meedog.model.AssetBenchmarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetBenchmarkMapper {
    long countByExample(AssetBenchmarkExample example);

    int deleteByExample(AssetBenchmarkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AssetBenchmark record);

    int insertSelective(AssetBenchmark record);

    List<AssetBenchmark> selectByExample(AssetBenchmarkExample example);

    AssetBenchmark selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AssetBenchmark record, @Param("example") AssetBenchmarkExample example);

    int updateByExample(@Param("record") AssetBenchmark record, @Param("example") AssetBenchmarkExample example);

    int updateByPrimaryKeySelective(AssetBenchmark record);

    int updateByPrimaryKey(AssetBenchmark record);
}