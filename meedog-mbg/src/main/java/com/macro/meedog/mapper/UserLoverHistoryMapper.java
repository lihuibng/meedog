package com.macro.meedog.mapper;

import com.macro.meedog.model.UserLoverHistory;
import com.macro.meedog.model.UserLoverHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLoverHistoryMapper {
    long countByExample(UserLoverHistoryExample example);

    int deleteByExample(UserLoverHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserLoverHistory record);

    int insertSelective(UserLoverHistory record);

    List<UserLoverHistory> selectByExample(UserLoverHistoryExample example);

    UserLoverHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserLoverHistory record, @Param("example") UserLoverHistoryExample example);

    int updateByExample(@Param("record") UserLoverHistory record, @Param("example") UserLoverHistoryExample example);

    int updateByPrimaryKeySelective(UserLoverHistory record);

    int updateByPrimaryKey(UserLoverHistory record);
}