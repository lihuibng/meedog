package com.macro.meedog.mapper;

import com.macro.meedog.model.UserAdminLogin;
import com.macro.meedog.model.UserAdminLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAdminLoginMapper {
    long countByExample(UserAdminLoginExample example);

    int deleteByExample(UserAdminLoginExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserAdminLogin record);

    int insertSelective(UserAdminLogin record);

    List<UserAdminLogin> selectByExample(UserAdminLoginExample example);

    UserAdminLogin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserAdminLogin record, @Param("example") UserAdminLoginExample example);

    int updateByExample(@Param("record") UserAdminLogin record, @Param("example") UserAdminLoginExample example);

    int updateByPrimaryKeySelective(UserAdminLogin record);

    int updateByPrimaryKey(UserAdminLogin record);
}