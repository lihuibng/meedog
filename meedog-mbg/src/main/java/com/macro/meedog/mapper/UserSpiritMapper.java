package com.macro.meedog.mapper;

import com.macro.meedog.model.UserSpirit;
import com.macro.meedog.model.UserSpiritExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSpiritMapper {
    long countByExample(UserSpiritExample example);

    int deleteByExample(UserSpiritExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserSpirit record);

    int insertSelective(UserSpirit record);

    List<UserSpirit> selectByExample(UserSpiritExample example);

    UserSpirit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserSpirit record, @Param("example") UserSpiritExample example);

    int updateByExample(@Param("record") UserSpirit record, @Param("example") UserSpiritExample example);

    int updateByPrimaryKeySelective(UserSpirit record);

    int updateByPrimaryKey(UserSpirit record);
}