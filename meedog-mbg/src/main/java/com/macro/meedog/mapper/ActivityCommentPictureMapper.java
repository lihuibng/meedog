package com.macro.meedog.mapper;

import com.macro.meedog.model.ActivityCommentPicture;
import com.macro.meedog.model.ActivityCommentPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityCommentPictureMapper {
    long countByExample(ActivityCommentPictureExample example);

    int deleteByExample(ActivityCommentPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ActivityCommentPicture record);

    int insertSelective(ActivityCommentPicture record);

    List<ActivityCommentPicture> selectByExample(ActivityCommentPictureExample example);

    ActivityCommentPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ActivityCommentPicture record, @Param("example") ActivityCommentPictureExample example);

    int updateByExample(@Param("record") ActivityCommentPicture record, @Param("example") ActivityCommentPictureExample example);

    int updateByPrimaryKeySelective(ActivityCommentPicture record);

    int updateByPrimaryKey(ActivityCommentPicture record);
}