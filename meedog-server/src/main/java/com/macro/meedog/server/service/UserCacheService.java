package com.macro.meedog.server.service;

import com.macro.meedog.model.User;

/**
 * 会员信息缓存业务类
 * Created by macro on 2020/3/14.
 */
public interface UserCacheService {
    /**
     * 删除会员用户缓存
     */
    void delUser(Long userId);

    /**
     * 获取会员用户缓存
     */
    User getUser(String username);

    /**
     * 设置会员用户缓存
     */
    void setUser(User member);

    /**
     * 设置验证码
     */
    void setAuthCode(String email, String authCode);

    /**
     * 获取验证码
     */
    String getAuthCode(String email);

    /**
     * 设置token
     */
    void setUserToken(long uid, String token);

    /**
     * 获取token
     */
    String getUserToken(long uid);

    /**
     * 删除token
     */
    void delUserToken(long uid);
}
