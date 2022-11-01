package com.macro.meedog.mapper;

import com.macro.meedog.model.UserCharactorTag;
import com.macro.meedog.model.UserCharactorTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCharactorTagMapper {
    long countByExample(UserCharactorTagExample example);

    int deleteByExample(UserCharactorTagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserCharactorTag record);

    int insertSelective(UserCharactorTag record);

    List<UserCharactorTag> selectByExample(UserCharactorTagExample example);

    UserCharactorTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserCharactorTag record, @Param("example") UserCharactorTagExample example);

    int updateByExample(@Param("record") UserCharactorTag record, @Param("example") UserCharactorTagExample example);

    int updateByPrimaryKeySelective(UserCharactorTag record);

    int updateByPrimaryKey(UserCharactorTag record);
}