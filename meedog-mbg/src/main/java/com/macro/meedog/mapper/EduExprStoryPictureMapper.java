package com.macro.meedog.mapper;

import com.macro.meedog.model.EduExprStoryPicture;
import com.macro.meedog.model.EduExprStoryPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduExprStoryPictureMapper {
    long countByExample(EduExprStoryPictureExample example);

    int deleteByExample(EduExprStoryPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EduExprStoryPicture record);

    int insertSelective(EduExprStoryPicture record);

    List<EduExprStoryPicture> selectByExample(EduExprStoryPictureExample example);

    EduExprStoryPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EduExprStoryPicture record, @Param("example") EduExprStoryPictureExample example);

    int updateByExample(@Param("record") EduExprStoryPicture record, @Param("example") EduExprStoryPictureExample example);

    int updateByPrimaryKeySelective(EduExprStoryPicture record);

    int updateByPrimaryKey(EduExprStoryPicture record);
}