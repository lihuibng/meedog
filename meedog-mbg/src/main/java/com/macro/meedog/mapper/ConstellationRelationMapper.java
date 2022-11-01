package com.macro.meedog.mapper;

import com.macro.meedog.model.ConstellationRelation;
import com.macro.meedog.model.ConstellationRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstellationRelationMapper {
    long countByExample(ConstellationRelationExample example);

    int deleteByExample(ConstellationRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConstellationRelation record);

    int insertSelective(ConstellationRelation record);

    List<ConstellationRelation> selectByExample(ConstellationRelationExample example);

    ConstellationRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConstellationRelation record, @Param("example") ConstellationRelationExample example);

    int updateByExample(@Param("record") ConstellationRelation record, @Param("example") ConstellationRelationExample example);

    int updateByPrimaryKeySelective(ConstellationRelation record);

    int updateByPrimaryKey(ConstellationRelation record);
}