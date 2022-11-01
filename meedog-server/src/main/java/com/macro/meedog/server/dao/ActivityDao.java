package com.macro.meedog.server.dao;

import com.macro.meedog.model.Activity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 首页信息管理自定义Dao
 * Created by meedog on 2020/10/27
 */
public interface ActivityDao {
    /**
     * 获取推荐活动
     */
    List<Activity> getHotActivityList(@Param("offset") Integer offset, @Param("limit") Integer limit);
}
