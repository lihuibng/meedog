package com.macro.meedog.mapper;

import com.macro.meedog.model.SexualType;
import com.macro.meedog.model.SexualTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SexualTypeMapper {
    long countByExample(SexualTypeExample example);

    int deleteByExample(SexualTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SexualType record);

    int insertSelective(SexualType record);

    List<SexualType> selectByExample(SexualTypeExample example);

    SexualType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SexualType record, @Param("example") SexualTypeExample example);

    int updateByExample(@Param("record") SexualType record, @Param("example") SexualTypeExample example);

    int updateByPrimaryKeySelective(SexualType record);

    int updateByPrimaryKey(SexualType record);
}