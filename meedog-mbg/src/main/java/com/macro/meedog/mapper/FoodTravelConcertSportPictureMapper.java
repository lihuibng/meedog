package com.macro.meedog.mapper;

import com.macro.meedog.model.FoodTravelConcertSportPicture;
import com.macro.meedog.model.FoodTravelConcertSportPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodTravelConcertSportPictureMapper {
    long countByExample(FoodTravelConcertSportPictureExample example);

    int deleteByExample(FoodTravelConcertSportPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FoodTravelConcertSportPicture record);

    int insertSelective(FoodTravelConcertSportPicture record);

    List<FoodTravelConcertSportPicture> selectByExample(FoodTravelConcertSportPictureExample example);

    FoodTravelConcertSportPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FoodTravelConcertSportPicture record, @Param("example") FoodTravelConcertSportPictureExample example);

    int updateByExample(@Param("record") FoodTravelConcertSportPicture record, @Param("example") FoodTravelConcertSportPictureExample example);

    int updateByPrimaryKeySelective(FoodTravelConcertSportPicture record);

    int updateByPrimaryKey(FoodTravelConcertSportPicture record);
}