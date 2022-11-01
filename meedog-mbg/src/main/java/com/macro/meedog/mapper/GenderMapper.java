package com.macro.meedog.mapper;

import com.macro.meedog.model.Gender;
import com.macro.meedog.model.GenderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GenderMapper {
    long countByExample(GenderExample example);

    int deleteByExample(GenderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Gender record);

    int insertSelective(Gender record);

    List<Gender> selectByExample(GenderExample example);

    Gender selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Gender record, @Param("example") GenderExample example);

    int updateByExample(@Param("record") Gender record, @Param("example") GenderExample example);

    int updateByPrimaryKeySelective(Gender record);

    int updateByPrimaryKey(Gender record);
}