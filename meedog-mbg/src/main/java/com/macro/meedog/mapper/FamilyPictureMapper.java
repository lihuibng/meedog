package com.macro.meedog.mapper;

import com.macro.meedog.model.FamilyPicture;
import com.macro.meedog.model.FamilyPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FamilyPictureMapper {
    long countByExample(FamilyPictureExample example);

    int deleteByExample(FamilyPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FamilyPicture record);

    int insertSelective(FamilyPicture record);

    List<FamilyPicture> selectByExample(FamilyPictureExample example);

    FamilyPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FamilyPicture record, @Param("example") FamilyPictureExample example);

    int updateByExample(@Param("record") FamilyPicture record, @Param("example") FamilyPictureExample example);

    int updateByPrimaryKeySelective(FamilyPicture record);

    int updateByPrimaryKey(FamilyPicture record);
}