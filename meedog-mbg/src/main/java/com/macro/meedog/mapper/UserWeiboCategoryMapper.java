package com.macro.meedog.mapper;

import com.macro.meedog.model.UserWeiboCategory;
import com.macro.meedog.model.UserWeiboCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWeiboCategoryMapper {
    long countByExample(UserWeiboCategoryExample example);

    int deleteByExample(UserWeiboCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserWeiboCategory record);

    int insertSelective(UserWeiboCategory record);

    List<UserWeiboCategory> selectByExample(UserWeiboCategoryExample example);

    UserWeiboCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserWeiboCategory record, @Param("example") UserWeiboCategoryExample example);

    int updateByExample(@Param("record") UserWeiboCategory record, @Param("example") UserWeiboCategoryExample example);

    int updateByPrimaryKeySelective(UserWeiboCategory record);

    int updateByPrimaryKey(UserWeiboCategory record);
}