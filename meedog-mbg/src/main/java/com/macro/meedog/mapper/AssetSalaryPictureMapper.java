package com.macro.meedog.mapper;

import com.macro.meedog.model.AssetSalaryPicture;
import com.macro.meedog.model.AssetSalaryPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetSalaryPictureMapper {
    long countByExample(AssetSalaryPictureExample example);

    int deleteByExample(AssetSalaryPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AssetSalaryPicture record);

    int insertSelective(AssetSalaryPicture record);

    List<AssetSalaryPicture> selectByExample(AssetSalaryPictureExample example);

    AssetSalaryPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AssetSalaryPicture record, @Param("example") AssetSalaryPictureExample example);

    int updateByExample(@Param("record") AssetSalaryPicture record, @Param("example") AssetSalaryPictureExample example);

    int updateByPrimaryKeySelective(AssetSalaryPicture record);

    int updateByPrimaryKey(AssetSalaryPicture record);
}