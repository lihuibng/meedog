package com.macro.meedog.mapper;

import com.macro.meedog.model.Constellation;
import com.macro.meedog.model.ConstellationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstellationMapper {
    long countByExample(ConstellationExample example);

    int deleteByExample(ConstellationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Constellation record);

    int insertSelective(Constellation record);

    List<Constellation> selectByExample(ConstellationExample example);

    Constellation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Constellation record, @Param("example") ConstellationExample example);

    int updateByExample(@Param("record") Constellation record, @Param("example") ConstellationExample example);

    int updateByPrimaryKeySelective(Constellation record);

    int updateByPrimaryKey(Constellation record);
}