package com.macro.meedog.mapper;

import com.macro.meedog.model.UserAssetSalary;
import com.macro.meedog.model.UserAssetSalaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAssetSalaryMapper {
    long countByExample(UserAssetSalaryExample example);

    int deleteByExample(UserAssetSalaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserAssetSalary record);

    int insertSelective(UserAssetSalary record);

    List<UserAssetSalary> selectByExample(UserAssetSalaryExample example);

    UserAssetSalary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserAssetSalary record, @Param("example") UserAssetSalaryExample example);

    int updateByExample(@Param("record") UserAssetSalary record, @Param("example") UserAssetSalaryExample example);

    int updateByPrimaryKeySelective(UserAssetSalary record);

    int updateByPrimaryKey(UserAssetSalary record);
}