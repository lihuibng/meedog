package com.macro.meedog.mapper;

import com.macro.meedog.model.UserCity;
import com.macro.meedog.model.UserCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCityMapper {
    long countByExample(UserCityExample example);

    int deleteByExample(UserCityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserCity record);

    int insertSelective(UserCity record);

    List<UserCity> selectByExample(UserCityExample example);

    UserCity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserCity record, @Param("example") UserCityExample example);

    int updateByExample(@Param("record") UserCity record, @Param("example") UserCityExample example);

    int updateByPrimaryKeySelective(UserCity record);

    int updateByPrimaryKey(UserCity record);
}