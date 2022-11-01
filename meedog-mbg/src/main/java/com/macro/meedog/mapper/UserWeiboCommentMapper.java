package com.macro.meedog.mapper;

import com.macro.meedog.model.UserWeiboComment;
import com.macro.meedog.model.UserWeiboCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWeiboCommentMapper {
    long countByExample(UserWeiboCommentExample example);

    int deleteByExample(UserWeiboCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserWeiboComment record);

    int insertSelective(UserWeiboComment record);

    List<UserWeiboComment> selectByExample(UserWeiboCommentExample example);

    UserWeiboComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserWeiboComment record, @Param("example") UserWeiboCommentExample example);

    int updateByExample(@Param("record") UserWeiboComment record, @Param("example") UserWeiboCommentExample example);

    int updateByPrimaryKeySelective(UserWeiboComment record);

    int updateByPrimaryKey(UserWeiboComment record);
}