package com.macro.meedog.mapper;

import com.macro.meedog.model.UserAdminLoginLog;
import com.macro.meedog.model.UserAdminLoginLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAdminLoginLogMapper {
    long countByExample(UserAdminLoginLogExample example);

    int deleteByExample(UserAdminLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserAdminLoginLog record);

    int insertSelective(UserAdminLoginLog record);

    List<UserAdminLoginLog> selectByExample(UserAdminLoginLogExample example);

    UserAdminLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserAdminLoginLog record, @Param("example") UserAdminLoginLogExample example);

    int updateByExample(@Param("record") UserAdminLoginLog record, @Param("example") UserAdminLoginLogExample example);

    int updateByPrimaryKeySelective(UserAdminLoginLog record);

    int updateByPrimaryKey(UserAdminLoginLog record);
}