package com.macro.meedog.mapper;

import com.macro.meedog.model.WorldCity;
import com.macro.meedog.model.WorldCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorldCityMapper {
    long countByExample(WorldCityExample example);

    int deleteByExample(WorldCityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WorldCity record);

    int insertSelective(WorldCity record);

    List<WorldCity> selectByExample(WorldCityExample example);

    WorldCity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WorldCity record, @Param("example") WorldCityExample example);

    int updateByExample(@Param("record") WorldCity record, @Param("example") WorldCityExample example);

    int updateByPrimaryKeySelective(WorldCity record);

    int updateByPrimaryKey(WorldCity record);
}