package com.macro.meedog.server.service;

import com.macro.meedog.server.domain.Collection;
import org.springframework.data.domain.Page;

/**
 * 会员商品收藏管理Service
 * Created by macro on 2018/8/2.
 */
public interface CollectionService {
    /**
     * 添加收藏
     */
    int add(Collection collection);

    /**
     * 删除收藏
     */
    int delete(Long id);

    /**
     * 分页查询收藏
     */
    Page<Collection> list(Integer pageNum, Integer pageSize);

    /**
     * 查看收藏详情
     */
    Collection detail(Long id);

    /**
     * 清空收藏
     */
    void clear();
}
