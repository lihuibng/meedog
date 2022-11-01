package com.macro.meedog.mapper;

import com.macro.meedog.model.WorldUniv;
import com.macro.meedog.model.WorldUnivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorldUnivMapper {
    long countByExample(WorldUnivExample example);

    int deleteByExample(WorldUnivExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WorldUniv record);

    int insertSelective(WorldUniv record);

    List<WorldUniv> selectByExample(WorldUnivExample example);

    WorldUniv selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WorldUniv record, @Param("example") WorldUnivExample example);

    int updateByExample(@Param("record") WorldUniv record, @Param("example") WorldUnivExample example);

    int updateByPrimaryKeySelective(WorldUniv record);

    int updateByPrimaryKey(WorldUniv record);
}