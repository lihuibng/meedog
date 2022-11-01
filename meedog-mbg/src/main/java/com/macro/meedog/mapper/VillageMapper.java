package com.macro.meedog.mapper;

import com.macro.meedog.model.Village;
import com.macro.meedog.model.VillageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VillageMapper {
    long countByExample(VillageExample example);

    int deleteByExample(VillageExample example);

    int deleteByPrimaryKey(String code);

    int insert(Village record);

    int insertSelective(Village record);

    List<Village> selectByExample(VillageExample example);

    Village selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") Village record, @Param("example") VillageExample example);

    int updateByExample(@Param("record") Village record, @Param("example") VillageExample example);

    int updateByPrimaryKeySelective(Village record);

    int updateByPrimaryKey(Village record);
}