package com.macro.meedog.mapper;

import com.macro.meedog.model.UserSpiritRelation;
import com.macro.meedog.model.UserSpiritRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSpiritRelationMapper {
    long countByExample(UserSpiritRelationExample example);

    int deleteByExample(UserSpiritRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserSpiritRelation record);

    int insertSelective(UserSpiritRelation record);

    List<UserSpiritRelation> selectByExample(UserSpiritRelationExample example);

    UserSpiritRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserSpiritRelation record, @Param("example") UserSpiritRelationExample example);

    int updateByExample(@Param("record") UserSpiritRelation record, @Param("example") UserSpiritRelationExample example);

    int updateByPrimaryKeySelective(UserSpiritRelation record);

    int updateByPrimaryKey(UserSpiritRelation record);
}