package com.macro.meedog.mapper;

import com.macro.meedog.model.WorldUniversity;
import com.macro.meedog.model.WorldUniversityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorldUniversityMapper {
    long countByExample(WorldUniversityExample example);

    int deleteByExample(WorldUniversityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WorldUniversity record);

    int insertSelective(WorldUniversity record);

    List<WorldUniversity> selectByExample(WorldUniversityExample example);

    WorldUniversity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WorldUniversity record, @Param("example") WorldUniversityExample example);

    int updateByExample(@Param("record") WorldUniversity record, @Param("example") WorldUniversityExample example);

    int updateByPrimaryKeySelective(WorldUniversity record);

    int updateByPrimaryKey(WorldUniversity record);
}