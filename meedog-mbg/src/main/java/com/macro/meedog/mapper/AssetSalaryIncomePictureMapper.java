package com.macro.meedog.mapper;

import com.macro.meedog.model.AssetSalaryIncomePicture;
import com.macro.meedog.model.AssetSalaryIncomePictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetSalaryIncomePictureMapper {
    long countByExample(AssetSalaryIncomePictureExample example);

    int deleteByExample(AssetSalaryIncomePictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AssetSalaryIncomePicture record);

    int insertSelective(AssetSalaryIncomePicture record);

    List<AssetSalaryIncomePicture> selectByExample(AssetSalaryIncomePictureExample example);

    AssetSalaryIncomePicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AssetSalaryIncomePicture record, @Param("example") AssetSalaryIncomePictureExample example);

    int updateByExample(@Param("record") AssetSalaryIncomePicture record, @Param("example") AssetSalaryIncomePictureExample example);

    int updateByPrimaryKeySelective(AssetSalaryIncomePicture record);

    int updateByPrimaryKey(AssetSalaryIncomePicture record);
}