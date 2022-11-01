package com.macro.meedog.server.service;

import com.macro.meedog.server.domain.WechatInfo;
import com.macro.meedog.server.domain.vo.UserWeiboVo;

import java.util.List;

/**
 * weibo Service
 * Created by macro on 2018/8/2.
 */
public interface WeiboService {
    /**
     * 添加
     */
    int add(UserWeiboVo userWeiboVo);

    /**
     * 删除
     */
    int delete(Long id);

    /**
     * 分页查询
     */
    List<UserWeiboVo> list(Integer pageNum, Integer pageSize);

    /**
     * 查看
     */
    UserWeiboVo detail(Long id);


    /**
     * like
     */
    int like(Long id);

    /**
     * share
     */
    int share(Long id);

    /**
     * comment
     */
    int comment(Long id);

    /**
     * 清空
     */
    int clear(Long id);
}
