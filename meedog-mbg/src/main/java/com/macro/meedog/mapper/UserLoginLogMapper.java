package com.macro.meedog.mapper;

import com.macro.meedog.model.UserLoginLog;
import com.macro.meedog.model.UserLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLoginLogMapper {
    long countByExample(UserLoginLogExample example);

    int deleteByExample(UserLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserLoginLog record);

    int insertSelective(UserLoginLog record);

    List<UserLoginLog> selectByExample(UserLoginLogExample example);

    UserLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserLoginLog record, @Param("example") UserLoginLogExample example);

    int updateByExample(@Param("record") UserLoginLog record, @Param("example") UserLoginLogExample example);

    int updateByPrimaryKeySelective(UserLoginLog record);

    int updateByPrimaryKey(UserLoginLog record);
}