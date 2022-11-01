package com.macro.meedog.mapper;

import com.macro.meedog.model.PlacePicture;
import com.macro.meedog.model.PlacePictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlacePictureMapper {
    long countByExample(PlacePictureExample example);

    int deleteByExample(PlacePictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlacePicture record);

    int insertSelective(PlacePicture record);

    List<PlacePicture> selectByExample(PlacePictureExample example);

    PlacePicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlacePicture record, @Param("example") PlacePictureExample example);

    int updateByExample(@Param("record") PlacePicture record, @Param("example") PlacePictureExample example);

    int updateByPrimaryKeySelective(PlacePicture record);

    int updateByPrimaryKey(PlacePicture record);
}