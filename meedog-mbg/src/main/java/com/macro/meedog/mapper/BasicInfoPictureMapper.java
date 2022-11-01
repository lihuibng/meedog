package com.macro.meedog.mapper;

import com.macro.meedog.model.BasicInfoPicture;
import com.macro.meedog.model.BasicInfoPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasicInfoPictureMapper {
    long countByExample(BasicInfoPictureExample example);

    int deleteByExample(BasicInfoPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BasicInfoPicture record);

    int insertSelective(BasicInfoPicture record);

    List<BasicInfoPicture> selectByExample(BasicInfoPictureExample example);

    BasicInfoPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BasicInfoPicture record, @Param("example") BasicInfoPictureExample example);

    int updateByExample(@Param("record") BasicInfoPicture record, @Param("example") BasicInfoPictureExample example);

    int updateByPrimaryKeySelective(BasicInfoPicture record);

    int updateByPrimaryKey(BasicInfoPicture record);
}