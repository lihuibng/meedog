package com.macro.meedog.server.dao;

import com.macro.meedog.model.UserWeiboComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 首页信息管理自定义Dao
 * Created by meedog on 2020/10/27
 */
public interface WeiboCommentDao {
    /**
     * 获取新人
     */
    List<UserWeiboComment> getWeiboCommentList(
            @Param("weibo_id") Integer weiboId,
            @Param("comment_id") Integer commentId,
            @Param("offset") Integer offset,
            @Param("limit") Integer limit);
}
