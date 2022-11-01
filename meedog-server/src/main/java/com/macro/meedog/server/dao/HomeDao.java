package com.macro.meedog.server.dao;

import com.macro.meedog.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 首页信息管理自定义Dao
 * Created by meedog on 2020/10/27
 */
public interface HomeDao {
    /**
     * 获取新人
     */
    List<User> getNewUserList(@Param("offset") Integer offset, @Param("limit") Integer limit);

    /**
     * 获取人气推荐
     */
    List<User> getRecommendUserList(@Param("offset") Integer offset, @Param("limit") Integer limit);

    /**
     * 付费用户展示
     */
    List<User> getAdUserList(@Param("offset") Integer offset, @Param("limit") Integer limit);

}
