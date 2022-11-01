package com.macro.meedog.mapper;

import com.macro.meedog.model.LoveConstraintPicture;
import com.macro.meedog.model.LoveConstraintPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoveConstraintPictureMapper {
    long countByExample(LoveConstraintPictureExample example);

    int deleteByExample(LoveConstraintPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoveConstraintPicture record);

    int insertSelective(LoveConstraintPicture record);

    List<LoveConstraintPicture> selectByExample(LoveConstraintPictureExample example);

    LoveConstraintPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoveConstraintPicture record, @Param("example") LoveConstraintPictureExample example);

    int updateByExample(@Param("record") LoveConstraintPicture record, @Param("example") LoveConstraintPictureExample example);

    int updateByPrimaryKeySelective(LoveConstraintPicture record);

    int updateByPrimaryKey(LoveConstraintPicture record);
}