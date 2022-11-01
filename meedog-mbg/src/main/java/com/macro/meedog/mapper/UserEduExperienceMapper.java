package com.macro.meedog.mapper;

import com.macro.meedog.model.UserEduExperience;
import com.macro.meedog.model.UserEduExperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEduExperienceMapper {
    long countByExample(UserEduExperienceExample example);

    int deleteByExample(UserEduExperienceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserEduExperience record);

    int insertSelective(UserEduExperience record);

    List<UserEduExperience> selectByExample(UserEduExperienceExample example);

    UserEduExperience selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserEduExperience record, @Param("example") UserEduExperienceExample example);

    int updateByExample(@Param("record") UserEduExperience record, @Param("example") UserEduExperienceExample example);

    int updateByPrimaryKeySelective(UserEduExperience record);

    int updateByPrimaryKey(UserEduExperience record);
}