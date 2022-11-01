package com.macro.meedog.server.service.impl;

import com.macro.meedog.model.User;
import com.macro.meedog.server.domain.Attention;
import com.macro.meedog.server.repository.AttentionRepository;
import com.macro.meedog.server.service.AttentionService;
import com.macro.meedog.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 会员关注Service实现类 not done
 * Created by macro on 2018/8/2.
 */
@Service
public class AttentionServiceImpl implements AttentionService {
    @Autowired
    private AttentionRepository attentionRepository;
    @Autowired
    private UserService userService;

    @Override
    public int add(Attention attention) {
        int count = 0;
        User user = userService.getCurrentUser();
        attention.setUserId(user.getId());
        attention.setNickname(user.getNickname());
        attention.setIcon(attention.getIcon());
        attention.setCreateTime(new Date());
        Attention findAttention = attentionRepository.findByUserIdAndActivityId(attention.getUserId(), attention.getActivityId());
        if (findAttention == null) {
            attentionRepository.save(attention);
            count = 1;
        }
        return count;
    }

    @Override
    public int delete(Long id) {
        User user = userService.getCurrentUser();
        return attentionRepository.deleteByUserIdAndActivityId(user.getId(), id);
    }

    @Override
    public Page<Attention> list(Integer pageNum, Integer pageSize) {
        User user = userService.getCurrentUser();
        Pageable pageable = PageRequest.of(pageNum - 1, pageSize);
        return attentionRepository.findByUserId(user.getId(), pageable);
    }

    @Override
    public Attention detail(Long id) {
        User user = userService.getCurrentUser();
        return attentionRepository.findByUserIdAndActivityId(user.getId(), id);
    }

    @Override
    public void clear() {
        User user = userService.getCurrentUser();
        attentionRepository.deleteAllByUserId(user.getId());
    }
}
