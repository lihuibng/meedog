package com.macro.meedog.server.repository;

import com.macro.meedog.server.domain.Attention;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 会员关注Repository
 * Created by macro on 2018/8/2.
 */
public interface AttentionRepository extends MongoRepository<Attention, String> {
    Attention findByUserIdAndActivityId(Long userId, Long activityId);

    int deleteByUserIdAndActivityId(Long userId, Long activityId);

    Page<Attention> findByUserId(Long userId, Pageable pageable);

    void deleteAllByUserId(Long userId);
}
