package com.macro.meedog.mapper;

import com.macro.meedog.model.LoveConfirmPicture;
import com.macro.meedog.model.LoveConfirmPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoveConfirmPictureMapper {
    long countByExample(LoveConfirmPictureExample example);

    int deleteByExample(LoveConfirmPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoveConfirmPicture record);

    int insertSelective(LoveConfirmPicture record);

    List<LoveConfirmPicture> selectByExample(LoveConfirmPictureExample example);

    LoveConfirmPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoveConfirmPicture record, @Param("example") LoveConfirmPictureExample example);

    int updateByExample(@Param("record") LoveConfirmPicture record, @Param("example") LoveConfirmPictureExample example);

    int updateByPrimaryKeySelective(LoveConfirmPicture record);

    int updateByPrimaryKey(LoveConfirmPicture record);
}