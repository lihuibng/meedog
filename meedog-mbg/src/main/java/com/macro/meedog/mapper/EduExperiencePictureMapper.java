package com.macro.meedog.mapper;

import com.macro.meedog.model.EduExperiencePicture;
import com.macro.meedog.model.EduExperiencePictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduExperiencePictureMapper {
    long countByExample(EduExperiencePictureExample example);

    int deleteByExample(EduExperiencePictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EduExperiencePicture record);

    int insertSelective(EduExperiencePicture record);

    List<EduExperiencePicture> selectByExample(EduExperiencePictureExample example);

    EduExperiencePicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EduExperiencePicture record, @Param("example") EduExperiencePictureExample example);

    int updateByExample(@Param("record") EduExperiencePicture record, @Param("example") EduExperiencePictureExample example);

    int updateByPrimaryKeySelective(EduExperiencePicture record);

    int updateByPrimaryKey(EduExperiencePicture record);
}