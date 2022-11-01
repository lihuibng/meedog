package com.macro.meedog.mapper;

import com.macro.meedog.model.UserPlan;
import com.macro.meedog.model.UserPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPlanMapper {
    long countByExample(UserPlanExample example);

    int deleteByExample(UserPlanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserPlan record);

    int insertSelective(UserPlan record);

    List<UserPlan> selectByExample(UserPlanExample example);

    UserPlan selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserPlan record, @Param("example") UserPlanExample example);

    int updateByExample(@Param("record") UserPlan record, @Param("example") UserPlanExample example);

    int updateByPrimaryKeySelective(UserPlan record);

    int updateByPrimaryKey(UserPlan record);
}