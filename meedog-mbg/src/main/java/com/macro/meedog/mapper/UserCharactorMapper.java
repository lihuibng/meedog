package com.macro.meedog.mapper;

import com.macro.meedog.model.UserCharactor;
import com.macro.meedog.model.UserCharactorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCharactorMapper {
    long countByExample(UserCharactorExample example);

    int deleteByExample(UserCharactorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserCharactor record);

    int insertSelective(UserCharactor record);

    List<UserCharactor> selectByExample(UserCharactorExample example);

    UserCharactor selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserCharactor record, @Param("example") UserCharactorExample example);

    int updateByExample(@Param("record") UserCharactor record, @Param("example") UserCharactorExample example);

    int updateByPrimaryKeySelective(UserCharactor record);

    int updateByPrimaryKey(UserCharactor record);
}