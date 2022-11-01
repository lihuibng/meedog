package com.macro.meedog.server.repository;

import com.macro.meedog.server.domain.ReadHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 会员商品浏览历史Repository
 * Created by macro on 2018/8/3.
 */
public interface ReadHistoryRepository extends MongoRepository<ReadHistory, String> {
    Page<ReadHistory> findByUserIdOrderByCreateTimeDesc(Long userId, Pageable pageable);

    void deleteAllByUserId(Long userId);
}
