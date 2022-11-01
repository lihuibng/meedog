package com.macro.meedog.server.repository;

import com.macro.meedog.server.domain.Collection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 商品收藏Repository
 * Created by macro on 2018/8/2.
 */
public interface CollectionRepository extends MongoRepository<Collection, String> {
    Collection findByUserIdAndActivityId(Long userId, Long activityId);

    int deleteByUserIdAndActivityId(Long userId, Long activityId);

    Page<Collection> findByUserId(Long userId, Pageable pageable);

    void deleteAllByUserId(Long userId);
}
