package com.macro.meedog.mapper;

import com.macro.meedog.model.UserFoodTravelConcertSport;
import com.macro.meedog.model.UserFoodTravelConcertSportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFoodTravelConcertSportMapper {
    long countByExample(UserFoodTravelConcertSportExample example);

    int deleteByExample(UserFoodTravelConcertSportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserFoodTravelConcertSport record);

    int insertSelective(UserFoodTravelConcertSport record);

    List<UserFoodTravelConcertSport> selectByExample(UserFoodTravelConcertSportExample example);

    UserFoodTravelConcertSport selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserFoodTravelConcertSport record, @Param("example") UserFoodTravelConcertSportExample example);

    int updateByExample(@Param("record") UserFoodTravelConcertSport record, @Param("example") UserFoodTravelConcertSportExample example);

    int updateByPrimaryKeySelective(UserFoodTravelConcertSport record);

    int updateByPrimaryKey(UserFoodTravelConcertSport record);
}