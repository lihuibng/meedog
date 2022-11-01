package com.macro.meedog.server.service.impl;

import com.macro.meedog.common.service.RedisService;
import com.macro.meedog.mapper.UserMapper;
import com.macro.meedog.model.User;
import com.macro.meedog.security.annotation.CacheException;
import com.macro.meedog.server.service.UserCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * UserCacheService实现类
 * Created by macro on 2020/3/14.
 */
@Service
public class UserCacheServiceImpl implements UserCacheService {
    @Autowired
    private RedisService redisService;
    @Autowired
    private UserMapper userMapper;
    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;
    @Value("${redis.expire.authCode}")
    private Long REDIS_EXPIRE_AUTH_CODE;
    @Value("${redis.key.user}")
    private String REDIS_KEY_USER;
    @Value("${redis.key.authCode}")
    private String REDIS_KEY_AUTH_CODE;

    @Value("${redis.key.uid}")
    private String REDIS_KEY_UID;

    @Override
    public void delUserToken(long uid) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_UID + ":" + uid;
        redisService.del(key);
    }

    @Override
    public String getUserToken(long uid) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_UID + ":" + uid;
        return (String) redisService.get(key);
    }

    @Override
    public void setUserToken(long uid, String token) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_USER + ":" + uid;
        redisService.set(key, token, REDIS_EXPIRE);
    }

    @Override
    public void delUser(Long userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        if (user != null) {
            String key = REDIS_DATABASE + ":" + REDIS_KEY_USER + ":" + user.getUsername();
            redisService.del(key);
        }
    }

    @Override
    public User getUser(String username) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_USER + ":" + username;
        return (User) redisService.get(key);
    }

    @Override
    public void setUser(User user) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_USER + ":" + user.getUsername();
        redisService.set(key, user, REDIS_EXPIRE);
    }

    @CacheException
    @Override
    public void setAuthCode(String email, String authCode) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_AUTH_CODE + ":" + email;
        redisService.set(key, authCode, REDIS_EXPIRE_AUTH_CODE);
    }

    @CacheException
    @Override
    public String getAuthCode(String email) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_AUTH_CODE + ":" + email;
        return (String) redisService.get(key);
    }
}
