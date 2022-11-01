package com.macro.meedog.mapper;

import com.macro.meedog.model.UserFoodTravelConcertSportStory;
import com.macro.meedog.model.UserFoodTravelConcertSportStoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFoodTravelConcertSportStoryMapper {
    long countByExample(UserFoodTravelConcertSportStoryExample example);

    int deleteByExample(UserFoodTravelConcertSportStoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserFoodTravelConcertSportStory record);

    int insertSelective(UserFoodTravelConcertSportStory record);

    List<UserFoodTravelConcertSportStory> selectByExample(UserFoodTravelConcertSportStoryExample example);

    UserFoodTravelConcertSportStory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserFoodTravelConcertSportStory record, @Param("example") UserFoodTravelConcertSportStoryExample example);

    int updateByExample(@Param("record") UserFoodTravelConcertSportStory record, @Param("example") UserFoodTravelConcertSportStoryExample example);

    int updateByPrimaryKeySelective(UserFoodTravelConcertSportStory record);

    int updateByPrimaryKey(UserFoodTravelConcertSportStory record);
}