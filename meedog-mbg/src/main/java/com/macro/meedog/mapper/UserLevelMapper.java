package com.macro.meedog.mapper;

import com.macro.meedog.model.UserLevel;
import com.macro.meedog.model.UserLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLevelMapper {
    long countByExample(UserLevelExample example);

    int deleteByExample(UserLevelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserLevel record);

    int insertSelective(UserLevel record);

    List<UserLevel> selectByExample(UserLevelExample example);

    UserLevel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserLevel record, @Param("example") UserLevelExample example);

    int updateByExample(@Param("record") UserLevel record, @Param("example") UserLevelExample example);

    int updateByPrimaryKeySelective(UserLevel record);

    int updateByPrimaryKey(UserLevel record);
}