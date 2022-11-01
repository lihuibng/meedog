package com.macro.meedog.server.domain;

import com.macro.meedog.model.Activity;
import com.macro.meedog.model.User;
import lombok.Data;

import java.util.List;

/**
 * 首页内容返回信息封装
 * Created by macro on 2019/1/28.
 */
@Data
public class HomeContentResult {
    long count;
    //推荐活动
    private List<Activity> hotActivityList;
    //轮播活动
    private List<User> adUserList;
    //推荐搜索列表
    private List<User> recommendUserList;
    //新注册
    private List<User> newUserList;
}
