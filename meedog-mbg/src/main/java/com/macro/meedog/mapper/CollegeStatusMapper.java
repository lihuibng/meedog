package com.macro.meedog.mapper;

import com.macro.meedog.model.CollegeStatus;
import com.macro.meedog.model.CollegeStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollegeStatusMapper {
    long countByExample(CollegeStatusExample example);

    int deleteByExample(CollegeStatusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CollegeStatus record);

    int insertSelective(CollegeStatus record);

    List<CollegeStatus> selectByExample(CollegeStatusExample example);

    CollegeStatus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CollegeStatus record, @Param("example") CollegeStatusExample example);

    int updateByExample(@Param("record") CollegeStatus record, @Param("example") CollegeStatusExample example);

    int updateByPrimaryKeySelective(CollegeStatus record);

    int updateByPrimaryKey(CollegeStatus record);
}