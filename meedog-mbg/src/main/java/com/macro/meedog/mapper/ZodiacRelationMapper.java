package com.macro.meedog.mapper;

import com.macro.meedog.model.ZodiacRelation;
import com.macro.meedog.model.ZodiacRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZodiacRelationMapper {
    long countByExample(ZodiacRelationExample example);

    int deleteByExample(ZodiacRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZodiacRelation record);

    int insertSelective(ZodiacRelation record);

    List<ZodiacRelation> selectByExample(ZodiacRelationExample example);

    ZodiacRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZodiacRelation record, @Param("example") ZodiacRelationExample example);

    int updateByExample(@Param("record") ZodiacRelation record, @Param("example") ZodiacRelationExample example);

    int updateByPrimaryKeySelective(ZodiacRelation record);

    int updateByPrimaryKey(ZodiacRelation record);
}