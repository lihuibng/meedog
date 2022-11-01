package com.macro.meedog.mapper;

import com.macro.meedog.model.UserHealth;
import com.macro.meedog.model.UserHealthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserHealthMapper {
    long countByExample(UserHealthExample example);

    int deleteByExample(UserHealthExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserHealth record);

    int insertSelective(UserHealth record);

    List<UserHealth> selectByExample(UserHealthExample example);

    UserHealth selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserHealth record, @Param("example") UserHealthExample example);

    int updateByExample(@Param("record") UserHealth record, @Param("example") UserHealthExample example);

    int updateByPrimaryKeySelective(UserHealth record);

    int updateByPrimaryKey(UserHealth record);
}