package com.macro.meedog.mapper;

import com.macro.meedog.model.LoveConstraint;
import com.macro.meedog.model.LoveConstraintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoveConstraintMapper {
    long countByExample(LoveConstraintExample example);

    int deleteByExample(LoveConstraintExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoveConstraint record);

    int insertSelective(LoveConstraint record);

    List<LoveConstraint> selectByExample(LoveConstraintExample example);

    LoveConstraint selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoveConstraint record, @Param("example") LoveConstraintExample example);

    int updateByExample(@Param("record") LoveConstraint record, @Param("example") LoveConstraintExample example);

    int updateByPrimaryKeySelective(LoveConstraint record);

    int updateByPrimaryKey(LoveConstraint record);
}