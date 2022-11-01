package com.macro.meedog.mapper;

import com.macro.meedog.model.PlaceCommentPicture;
import com.macro.meedog.model.PlaceCommentPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlaceCommentPictureMapper {
    long countByExample(PlaceCommentPictureExample example);

    int deleteByExample(PlaceCommentPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlaceCommentPicture record);

    int insertSelective(PlaceCommentPicture record);

    List<PlaceCommentPicture> selectByExample(PlaceCommentPictureExample example);

    PlaceCommentPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlaceCommentPicture record, @Param("example") PlaceCommentPictureExample example);

    int updateByExample(@Param("record") PlaceCommentPicture record, @Param("example") PlaceCommentPictureExample example);

    int updateByPrimaryKeySelective(PlaceCommentPicture record);

    int updateByPrimaryKey(PlaceCommentPicture record);
}