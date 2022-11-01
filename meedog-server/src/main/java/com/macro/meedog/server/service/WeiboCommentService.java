package com.macro.meedog.server.service;

import com.macro.meedog.model.UserWeiboComment;
import com.macro.meedog.server.domain.vo.WeiboCommentVo;

import java.util.List;

/**
 * WeiboCommentService
 * Created by macro on 2018/8/2.
 */
public interface WeiboCommentService {
    /**
     * 添加
     */
    int add(WeiboCommentVo v);

    /**
     * 删除
     */
    int delete(Long id);

    /**
     * 分页查询
     */
    List<UserWeiboComment> list(Long weiboId, Long commentId, Integer pageNum, Integer pageSize);

    /**
     * 查看
     */
    UserWeiboComment detail(Long id);

    /**
     * 清空
     */
    int clear(Long id);
}
