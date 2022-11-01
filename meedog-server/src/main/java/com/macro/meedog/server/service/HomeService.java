package com.macro.meedog.server.service;

import com.macro.meedog.model.Activity;
import com.macro.meedog.model.User;
import com.macro.meedog.server.domain.HomeContentResult;

import java.util.List;

/**
 * 首页内容管理Service
 * Created by meedog on 2020/10/27.
 */
public interface HomeService {

    /**
     * 获取首页内容
     */
    HomeContentResult content();

    /**
     * 首页推荐
     */
    List<User> getRecommendUserList(Integer pageNum, Integer pageSize);

    /**
     * 获取推广人信息
     *
     * @param
     */
    List<User> getAdUserList(Integer pageNum, Integer pageSize);

    /**
     * @param
     */
    List<User> getNewUserList(Integer pageNum, Integer pageSize);

    /**
     * 分页获取人气推荐活动
     */
    List<Activity> getHotActivityList(Integer pageNum, Integer pageSize);

    /**
     * 获得人总数
     */
    long count();
}
