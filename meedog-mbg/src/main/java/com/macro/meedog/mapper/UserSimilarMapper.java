package com.macro.meedog.mapper;

import com.macro.meedog.model.UserSimilar;
import com.macro.meedog.model.UserSimilarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSimilarMapper {
    long countByExample(UserSimilarExample example);

    int deleteByExample(UserSimilarExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserSimilar record);

    int insertSelective(UserSimilar record);

    List<UserSimilar> selectByExample(UserSimilarExample example);

    UserSimilar selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserSimilar record, @Param("example") UserSimilarExample example);

    int updateByExample(@Param("record") UserSimilar record, @Param("example") UserSimilarExample example);

    int updateByPrimaryKeySelective(UserSimilar record);

    int updateByPrimaryKey(UserSimilar record);
}