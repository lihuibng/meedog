package com.macro.meedog.mapper;

import com.macro.meedog.model.FoodTravelConcertSportStoryPicture;
import com.macro.meedog.model.FoodTravelConcertSportStoryPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodTravelConcertSportStoryPictureMapper {
    long countByExample(FoodTravelConcertSportStoryPictureExample example);

    int deleteByExample(FoodTravelConcertSportStoryPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FoodTravelConcertSportStoryPicture record);

    int insertSelective(FoodTravelConcertSportStoryPicture record);

    List<FoodTravelConcertSportStoryPicture> selectByExample(FoodTravelConcertSportStoryPictureExample example);

    FoodTravelConcertSportStoryPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FoodTravelConcertSportStoryPicture record, @Param("example") FoodTravelConcertSportStoryPictureExample example);

    int updateByExample(@Param("record") FoodTravelConcertSportStoryPicture record, @Param("example") FoodTravelConcertSportStoryPictureExample example);

    int updateByPrimaryKeySelective(FoodTravelConcertSportStoryPicture record);

    int updateByPrimaryKey(FoodTravelConcertSportStoryPicture record);
}