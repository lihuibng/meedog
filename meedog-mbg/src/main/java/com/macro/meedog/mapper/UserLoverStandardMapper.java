package com.macro.meedog.mapper;

import com.macro.meedog.model.UserLoverStandard;
import com.macro.meedog.model.UserLoverStandardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLoverStandardMapper {
    long countByExample(UserLoverStandardExample example);

    int deleteByExample(UserLoverStandardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserLoverStandard record);

    int insertSelective(UserLoverStandard record);

    List<UserLoverStandard> selectByExample(UserLoverStandardExample example);

    UserLoverStandard selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserLoverStandard record, @Param("example") UserLoverStandardExample example);

    int updateByExample(@Param("record") UserLoverStandard record, @Param("example") UserLoverStandardExample example);

    int updateByPrimaryKeySelective(UserLoverStandard record);

    int updateByPrimaryKey(UserLoverStandard record);
}