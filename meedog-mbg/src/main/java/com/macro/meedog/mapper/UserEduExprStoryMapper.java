package com.macro.meedog.mapper;

import com.macro.meedog.model.UserEduExprStory;
import com.macro.meedog.model.UserEduExprStoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEduExprStoryMapper {
    long countByExample(UserEduExprStoryExample example);

    int deleteByExample(UserEduExprStoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserEduExprStory record);

    int insertSelective(UserEduExprStory record);

    List<UserEduExprStory> selectByExample(UserEduExprStoryExample example);

    UserEduExprStory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserEduExprStory record, @Param("example") UserEduExprStoryExample example);

    int updateByExample(@Param("record") UserEduExprStory record, @Param("example") UserEduExprStoryExample example);

    int updateByPrimaryKeySelective(UserEduExprStory record);

    int updateByPrimaryKey(UserEduExprStory record);
}