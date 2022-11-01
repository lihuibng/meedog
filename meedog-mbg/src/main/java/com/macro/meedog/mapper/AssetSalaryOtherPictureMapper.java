package com.macro.meedog.mapper;

import com.macro.meedog.model.AssetSalaryOtherPicture;
import com.macro.meedog.model.AssetSalaryOtherPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetSalaryOtherPictureMapper {
    long countByExample(AssetSalaryOtherPictureExample example);

    int deleteByExample(AssetSalaryOtherPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AssetSalaryOtherPicture record);

    int insertSelective(AssetSalaryOtherPicture record);

    List<AssetSalaryOtherPicture> selectByExample(AssetSalaryOtherPictureExample example);

    AssetSalaryOtherPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AssetSalaryOtherPicture record, @Param("example") AssetSalaryOtherPictureExample example);

    int updateByExample(@Param("record") AssetSalaryOtherPicture record, @Param("example") AssetSalaryOtherPictureExample example);

    int updateByPrimaryKeySelective(AssetSalaryOtherPicture record);

    int updateByPrimaryKey(AssetSalaryOtherPicture record);
}