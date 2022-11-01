package com.macro.meedog.mapper;

import com.macro.meedog.model.IdentifyPicture;
import com.macro.meedog.model.IdentifyPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdentifyPictureMapper {
    long countByExample(IdentifyPictureExample example);

    int deleteByExample(IdentifyPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(IdentifyPicture record);

    int insertSelective(IdentifyPicture record);

    List<IdentifyPicture> selectByExample(IdentifyPictureExample example);

    IdentifyPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") IdentifyPicture record, @Param("example") IdentifyPictureExample example);

    int updateByExample(@Param("record") IdentifyPicture record, @Param("example") IdentifyPictureExample example);

    int updateByPrimaryKeySelective(IdentifyPicture record);

    int updateByPrimaryKey(IdentifyPicture record);
}