package com.macro.meedog.mapper;

import com.macro.meedog.model.LoveConfirm;
import com.macro.meedog.model.LoveConfirmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoveConfirmMapper {
    long countByExample(LoveConfirmExample example);

    int deleteByExample(LoveConfirmExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoveConfirm record);

    int insertSelective(LoveConfirm record);

    List<LoveConfirm> selectByExample(LoveConfirmExample example);

    LoveConfirm selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoveConfirm record, @Param("example") LoveConfirmExample example);

    int updateByExample(@Param("record") LoveConfirm record, @Param("example") LoveConfirmExample example);

    int updateByPrimaryKeySelective(LoveConfirm record);

    int updateByPrimaryKey(LoveConfirm record);
}