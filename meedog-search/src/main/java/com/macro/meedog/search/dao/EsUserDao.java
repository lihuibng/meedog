package com.macro.meedog.search.dao;

import com.macro.meedog.search.domain.EsUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 搜索系统中的人管理自定义Dao
 * Created by macro on 2018/6/19.
 */
public interface EsUserDao {
    /**
     * 获取指定ID的搜索人
     */
    List<EsUser> getAllEsUserList(@Param("id") Long id);
}
