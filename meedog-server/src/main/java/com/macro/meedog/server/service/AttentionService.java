package com.macro.meedog.server.service;

import com.macro.meedog.server.domain.Attention;
import org.springframework.data.domain.Page;

/**
 * 会员品牌关注管理Service
 * Created by macro on 2018/8/2.
 */
public interface AttentionService {
    /**
     * 添加关注
     */
    int add(Attention attention);

    /**
     * 取消关注
     */
    int delete(Long id);

    /**
     * 获取用户关注列表
     */
    Page<Attention> list(Integer pageNum, Integer pageSize);

    /**
     * 获取用户关注详情
     */
    Attention detail(Long id);

    /**
     * 清空关注列表
     */
    void clear();
}
