package com.macro.meedog.mapper;

import com.macro.meedog.model.AssetSalaryHousePicture;
import com.macro.meedog.model.AssetSalaryHousePictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetSalaryHousePictureMapper {
    long countByExample(AssetSalaryHousePictureExample example);

    int deleteByExample(AssetSalaryHousePictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AssetSalaryHousePicture record);

    int insertSelective(AssetSalaryHousePicture record);

    List<AssetSalaryHousePicture> selectByExample(AssetSalaryHousePictureExample example);

    AssetSalaryHousePicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AssetSalaryHousePicture record, @Param("example") AssetSalaryHousePictureExample example);

    int updateByExample(@Param("record") AssetSalaryHousePicture record, @Param("example") AssetSalaryHousePictureExample example);

    int updateByPrimaryKeySelective(AssetSalaryHousePicture record);

    int updateByPrimaryKey(AssetSalaryHousePicture record);
}