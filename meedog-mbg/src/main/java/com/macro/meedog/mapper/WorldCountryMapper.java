package com.macro.meedog.mapper;

import com.macro.meedog.model.WorldCountry;
import com.macro.meedog.model.WorldCountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorldCountryMapper {
    long countByExample(WorldCountryExample example);

    int deleteByExample(WorldCountryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WorldCountry record);

    int insertSelective(WorldCountry record);

    List<WorldCountry> selectByExample(WorldCountryExample example);

    WorldCountry selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WorldCountry record, @Param("example") WorldCountryExample example);

    int updateByExample(@Param("record") WorldCountry record, @Param("example") WorldCountryExample example);

    int updateByPrimaryKeySelective(WorldCountry record);

    int updateByPrimaryKey(WorldCountry record);
}