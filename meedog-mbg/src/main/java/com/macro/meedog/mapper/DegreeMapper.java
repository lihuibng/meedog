package com.macro.meedog.mapper;

import com.macro.meedog.model.Degree;
import com.macro.meedog.model.DegreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DegreeMapper {
    long countByExample(DegreeExample example);

    int deleteByExample(DegreeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Degree record);

    int insertSelective(Degree record);

    List<Degree> selectByExample(DegreeExample example);

    Degree selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Degree record, @Param("example") DegreeExample example);

    int updateByExample(@Param("record") Degree record, @Param("example") DegreeExample example);

    int updateByPrimaryKeySelective(Degree record);

    int updateByPrimaryKey(Degree record);
}