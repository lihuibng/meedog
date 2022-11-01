package com.macro.meedog.server.service.impl;

import com.macro.meedog.mapper.UserMapper;
import com.macro.meedog.model.Activity;
import com.macro.meedog.model.User;
import com.macro.meedog.server.dao.ActivityDao;
import com.macro.meedog.server.dao.HomeDao;
import com.macro.meedog.server.domain.HomeContentResult;
import com.macro.meedog.server.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 首页内容管理Service实现类
 * Created by macro on 2019/1/28.
 */
@Service
public class HomeServiceImpl implements HomeService {
    @Autowired
    private HomeDao homeDao;

    @Autowired
    private ActivityDao activityDao;

    @Autowired
    private UserMapper userMapper;

    @Override
    public HomeContentResult content() {
        HomeContentResult result = new HomeContentResult();
        //获取人气推荐
        result.setHotActivityList(getHotActivityList(0, 10));

        //获取首页付费用户
        result.setAdUserList(getAdUserList(0, 10));

        //获取新用户
        result.setNewUserList(getNewUserList(0, 10));

        result.setRecommendUserList(getRecommendUserList(0, 10));

        result.setCount(count());
        return result;
    }

    @Override
    public List<User> getRecommendUserList(Integer pageNum, Integer pageSize) {
        int offset = pageSize * (pageNum - 1);
        return homeDao.getRecommendUserList(offset, pageSize);
    }

    @Override
    public List<Activity> getHotActivityList(Integer pageNum, Integer pageSize) {
        int offset = pageSize * (pageNum - 1);
        return activityDao.getHotActivityList(offset, pageSize);
    }

    @Override
    public List<User> getNewUserList(Integer pageNum, Integer pageSize) {
        int offset = pageSize * (pageNum - 1);
        return homeDao.getNewUserList(offset, pageSize);
    }

    @Override
    public long count() {
        return userMapper.countByExample(null);
    }

    @Override
    public List<User> getAdUserList(Integer pageNum, Integer pageSize) {
        int offset = pageSize * (pageNum - 1);
        return homeDao.getAdUserList(offset, pageSize);
    }
}
