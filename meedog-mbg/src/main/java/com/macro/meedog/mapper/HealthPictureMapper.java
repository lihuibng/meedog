package com.macro.meedog.mapper;

import com.macro.meedog.model.HealthPicture;
import com.macro.meedog.model.HealthPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HealthPictureMapper {
    long countByExample(HealthPictureExample example);

    int deleteByExample(HealthPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HealthPicture record);

    int insertSelective(HealthPicture record);

    List<HealthPicture> selectByExample(HealthPictureExample example);

    HealthPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HealthPicture record, @Param("example") HealthPictureExample example);

    int updateByExample(@Param("record") HealthPicture record, @Param("example") HealthPictureExample example);

    int updateByPrimaryKeySelective(HealthPicture record);

    int updateByPrimaryKey(HealthPicture record);
}