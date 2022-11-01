package com.macro.meedog.mapper;

import com.macro.meedog.model.Street;
import com.macro.meedog.model.StreetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StreetMapper {
    long countByExample(StreetExample example);

    int deleteByExample(StreetExample example);

    int deleteByPrimaryKey(String code);

    int insert(Street record);

    int insertSelective(Street record);

    List<Street> selectByExample(StreetExample example);

    Street selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") Street record, @Param("example") StreetExample example);

    int updateByExample(@Param("record") Street record, @Param("example") StreetExample example);

    int updateByPrimaryKeySelective(Street record);

    int updateByPrimaryKey(Street record);
}