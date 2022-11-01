package com.macro.meedog.mapper;

import com.macro.meedog.model.UserInvitation;
import com.macro.meedog.model.UserInvitationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInvitationMapper {
    long countByExample(UserInvitationExample example);

    int deleteByExample(UserInvitationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserInvitation record);

    int insertSelective(UserInvitation record);

    List<UserInvitation> selectByExample(UserInvitationExample example);

    UserInvitation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserInvitation record, @Param("example") UserInvitationExample example);

    int updateByExample(@Param("record") UserInvitation record, @Param("example") UserInvitationExample example);

    int updateByPrimaryKeySelective(UserInvitation record);

    int updateByPrimaryKey(UserInvitation record);
}