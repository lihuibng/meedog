package com.macro.meedog.mapper;

import com.macro.meedog.model.UserWeibo;
import com.macro.meedog.model.UserWeiboExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWeiboMapper {
    long countByExample(UserWeiboExample example);

    int deleteByExample(UserWeiboExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserWeibo record);

    int insertSelective(UserWeibo record);

    List<UserWeibo> selectByExample(UserWeiboExample example);

    UserWeibo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserWeibo record, @Param("example") UserWeiboExample example);

    int updateByExample(@Param("record") UserWeibo record, @Param("example") UserWeiboExample example);

    int updateByPrimaryKeySelective(UserWeibo record);

    int updateByPrimaryKey(UserWeibo record);
}