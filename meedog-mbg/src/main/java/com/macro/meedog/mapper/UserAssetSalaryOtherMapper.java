package com.macro.meedog.mapper;

import com.macro.meedog.model.UserAssetSalaryOther;
import com.macro.meedog.model.UserAssetSalaryOtherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAssetSalaryOtherMapper {
    long countByExample(UserAssetSalaryOtherExample example);

    int deleteByExample(UserAssetSalaryOtherExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserAssetSalaryOther record);

    int insertSelective(UserAssetSalaryOther record);

    List<UserAssetSalaryOther> selectByExample(UserAssetSalaryOtherExample example);

    UserAssetSalaryOther selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserAssetSalaryOther record, @Param("example") UserAssetSalaryOtherExample example);

    int updateByExample(@Param("record") UserAssetSalaryOther record, @Param("example") UserAssetSalaryOtherExample example);

    int updateByPrimaryKeySelective(UserAssetSalaryOther record);

    int updateByPrimaryKey(UserAssetSalaryOther record);
}