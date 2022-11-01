package com.macro.meedog.server.service.impl;

import com.macro.meedog.model.User;
import com.macro.meedog.server.domain.Collection;
import com.macro.meedog.server.repository.CollectionRepository;
import com.macro.meedog.server.service.CollectionService;
import com.macro.meedog.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * 会员收藏Service实现类
 * Created by macro on 2018/8/2.
 */
@Service
public class CollectionServiceImpl implements CollectionService {
    @Autowired
    private CollectionRepository collectionRepository;
    @Autowired
    private UserService userService;

    @Override
    public int add(Collection collection) {
        int count = 0;
        User user = userService.getCurrentUser();
        collection.setUserId(user.getId());
        collection.setNickname(user.getNickname());
        collection.setIcon(user.getIcon());
        Collection findCollection = collectionRepository.findByUserIdAndActivityId(
                collection.getUserId(), collection.getActivityId());
        if (findCollection == null) {
            collectionRepository.save(collection);
            count = 1;
        }
        return count;
    }

    @Override
    public int delete(Long id) {
        User user = userService.getCurrentUser();
        return collectionRepository.deleteByUserIdAndActivityId(user.getId(), id);
    }

    @Override
    public Page<Collection> list(Integer pageNum, Integer pageSize) {
        User user = userService.getCurrentUser();
        Pageable pageable = PageRequest.of(pageNum - 1, pageSize);
        return collectionRepository.findByUserId(user.getId(), pageable);
    }

    @Override
    public Collection detail(Long id) {
        User user = userService.getCurrentUser();
        return collectionRepository.findByUserIdAndActivityId(user.getId(), id);
    }

    @Override
    public void clear() {
        User user = userService.getCurrentUser();
        collectionRepository.deleteAllByUserId(user.getId());
    }
}
