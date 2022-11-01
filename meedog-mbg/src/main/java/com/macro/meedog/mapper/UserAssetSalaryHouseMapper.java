package com.macro.meedog.mapper;

import com.macro.meedog.model.UserAssetSalaryHouse;
import com.macro.meedog.model.UserAssetSalaryHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAssetSalaryHouseMapper {
    long countByExample(UserAssetSalaryHouseExample example);

    int deleteByExample(UserAssetSalaryHouseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserAssetSalaryHouse record);

    int insertSelective(UserAssetSalaryHouse record);

    List<UserAssetSalaryHouse> selectByExample(UserAssetSalaryHouseExample example);

    UserAssetSalaryHouse selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserAssetSalaryHouse record, @Param("example") UserAssetSalaryHouseExample example);

    int updateByExample(@Param("record") UserAssetSalaryHouse record, @Param("example") UserAssetSalaryHouseExample example);

    int updateByPrimaryKeySelective(UserAssetSalaryHouse record);

    int updateByPrimaryKey(UserAssetSalaryHouse record);
}