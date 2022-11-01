package com.macro.meedog.server.dao;

import com.macro.meedog.model.UserWeibo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 首页信息管理自定义Dao
 * Created by meedog on 2020/10/27
 */
public interface UserWeiboDao {
    /**
     * 获取新人
     */
    List<UserWeibo> getUserWeiboList(@Param("offset") Integer offset, @Param("limit") Integer limit);



}
