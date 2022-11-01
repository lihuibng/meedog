package com.macro.meedog.mapper;

import com.macro.meedog.model.UserAssetSalaryIncome;
import com.macro.meedog.model.UserAssetSalaryIncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAssetSalaryIncomeMapper {
    long countByExample(UserAssetSalaryIncomeExample example);

    int deleteByExample(UserAssetSalaryIncomeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserAssetSalaryIncome record);

    int insertSelective(UserAssetSalaryIncome record);

    List<UserAssetSalaryIncome> selectByExample(UserAssetSalaryIncomeExample example);

    UserAssetSalaryIncome selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserAssetSalaryIncome record, @Param("example") UserAssetSalaryIncomeExample example);

    int updateByExample(@Param("record") UserAssetSalaryIncome record, @Param("example") UserAssetSalaryIncomeExample example);

    int updateByPrimaryKeySelective(UserAssetSalaryIncome record);

    int updateByPrimaryKey(UserAssetSalaryIncome record);
}