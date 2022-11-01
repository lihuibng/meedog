package com.macro.meedog.mapper;

import com.macro.meedog.model.UserRolePermissionRelation;
import com.macro.meedog.model.UserRolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRolePermissionRelationMapper {
    long countByExample(UserRolePermissionRelationExample example);

    int deleteByExample(UserRolePermissionRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRolePermissionRelation record);

    int insertSelective(UserRolePermissionRelation record);

    List<UserRolePermissionRelation> selectByExample(UserRolePermissionRelationExample example);

    UserRolePermissionRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserRolePermissionRelation record, @Param("example") UserRolePermissionRelationExample example);

    int updateByExample(@Param("record") UserRolePermissionRelation record, @Param("example") UserRolePermissionRelationExample example);

    int updateByPrimaryKeySelective(UserRolePermissionRelation record);

    int updateByPrimaryKey(UserRolePermissionRelation record);
}