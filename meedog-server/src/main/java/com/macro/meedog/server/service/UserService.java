package com.macro.meedog.server.service;

import com.macro.meedog.model.User;
import com.macro.meedog.model.UserInvitation;
import com.macro.meedog.server.domain.LoginResult;
import com.macro.meedog.server.domain.RegisterInfo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 会员管理Service
 * Created by macro on 2018/8/3.
 */
public interface UserService {
    /**
     * 根据用户名获取会员
     */
    User getByUsername(String username);

    /**
     * 根据邮箱获取会员
     */
    User getByEmail(String email);

    /**
     * 根据会员编号获取会员
     */
    User getById(Long id);

    /**
     * 登录后获取token
     */
    LoginResult login(String username, String password);

    /**
     * 刷新token
     */
    String refreshToken(String token);

    /**
     * 用户注册
     */
    @Transactional
    void register(String username, String password, String email, String authCode);

    /**
     * 用户注册
     */
    @Transactional
    void register(RegisterInfo registerInfo);

    /**
     * 生成验证码
     */
    String generateAuthCode(String email);

    /**
     * 生成邀请码
     */
    void updateInvitation(String email, String uid);

    /**
     * 生成邀请码
     */
    List<UserInvitation> getInvitations(String uid);

    /**
     * 修改密码
     */
    @Transactional
    void updatePassword(String email, String password, String authCode);

    /**
     * 修改信息
     */
    @Transactional
    void updateInfo(String uid, String username, String phone);

    /**
     * 获取当前登录会员
     */
    User getCurrentUser();

    /**
     * 获取用户信息
     */
    UserDetails loadUserByUsername(String username);

    /**
     * 获取用户信息
     */
    UserDetails loadUserByOpenid(String openid);

    /**
     * 根据用户名获取会员
     */
    User getByOpenid(String openid);

    /**
     * 登录后获取token
     */
    LoginResult login(String openid);

    /**
     * 用户注册
     */
    @Transactional
    void register(String openid, String sessionKey);
}
