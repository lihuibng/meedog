package com.macro.meedog.mapper;

import com.macro.meedog.model.ActivityPicture;
import com.macro.meedog.model.ActivityPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityPictureMapper {
    long countByExample(ActivityPictureExample example);

    int deleteByExample(ActivityPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ActivityPicture record);

    int insertSelective(ActivityPicture record);

    List<ActivityPicture> selectByExample(ActivityPictureExample example);

    ActivityPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ActivityPicture record, @Param("example") ActivityPictureExample example);

    int updateByExample(@Param("record") ActivityPicture record, @Param("example") ActivityPictureExample example);

    int updateByPrimaryKeySelective(ActivityPicture record);

    int updateByPrimaryKey(ActivityPicture record);
}