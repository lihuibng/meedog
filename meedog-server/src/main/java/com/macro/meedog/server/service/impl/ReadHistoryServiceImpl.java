package com.macro.meedog.server.service.impl;

import com.macro.meedog.model.User;
import com.macro.meedog.server.domain.ReadHistory;
import com.macro.meedog.server.repository.ReadHistoryRepository;
import com.macro.meedog.server.service.ReadHistoryService;
import com.macro.meedog.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 会员浏览记录管理Service实现类
 * Created by macro on 2018/8/3.
 */
@Service
public class ReadHistoryServiceImpl implements ReadHistoryService {
    @Autowired
    private ReadHistoryRepository readHistoryRepository;
    @Autowired
    private UserService userService;

    @Override
    public int create(ReadHistory readHistory) {
        User user = userService.getCurrentUser();
        readHistory.setUserId(user.getId());
        readHistory.setNickname(user.getNickname());
        readHistory.setIcon(user.getIcon());
        Long id = Long.valueOf(0);
        readHistory.setId(id);
        readHistory.setCreateTime(new Date());
        readHistoryRepository.save(readHistory);
        return 1;
    }

    @Override
    public int delete(List<String> ids) {
        List<ReadHistory> deleteList = new ArrayList<>();
        for (String id : ids) {
            ReadHistory readHistory = new ReadHistory();
            readHistory.setId(Long.valueOf(id));
            deleteList.add(readHistory);
        }
        readHistoryRepository.deleteAll(deleteList);
        return ids.size();
    }

    @Override
    public Page<ReadHistory> list(Integer pageNum, Integer pageSize) {
        User user = userService.getCurrentUser();
        Pageable pageable = PageRequest.of(pageNum - 1, pageSize);
        return readHistoryRepository.findByUserIdOrderByCreateTimeDesc(user.getId(), pageable);
    }

    @Override
    public void clear() {
        User user = userService.getCurrentUser();
        readHistoryRepository.deleteAllByUserId(user.getId());
    }
}
