package com.macro.meedog.mapper;

import com.macro.meedog.model.UserWeiboCommentPicture;
import com.macro.meedog.model.UserWeiboCommentPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWeiboCommentPictureMapper {
    long countByExample(UserWeiboCommentPictureExample example);

    int deleteByExample(UserWeiboCommentPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserWeiboCommentPicture record);

    int insertSelective(UserWeiboCommentPicture record);

    List<UserWeiboCommentPicture> selectByExample(UserWeiboCommentPictureExample example);

    UserWeiboCommentPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserWeiboCommentPicture record, @Param("example") UserWeiboCommentPictureExample example);

    int updateByExample(@Param("record") UserWeiboCommentPicture record, @Param("example") UserWeiboCommentPictureExample example);

    int updateByPrimaryKeySelective(UserWeiboCommentPicture record);

    int updateByPrimaryKey(UserWeiboCommentPicture record);
}