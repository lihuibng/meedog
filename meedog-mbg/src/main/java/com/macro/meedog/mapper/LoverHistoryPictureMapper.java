package com.macro.meedog.mapper;

import com.macro.meedog.model.LoverHistoryPicture;
import com.macro.meedog.model.LoverHistoryPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoverHistoryPictureMapper {
    long countByExample(LoverHistoryPictureExample example);

    int deleteByExample(LoverHistoryPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoverHistoryPicture record);

    int insertSelective(LoverHistoryPicture record);

    List<LoverHistoryPicture> selectByExample(LoverHistoryPictureExample example);

    LoverHistoryPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoverHistoryPicture record, @Param("example") LoverHistoryPictureExample example);

    int updateByExample(@Param("record") LoverHistoryPicture record, @Param("example") LoverHistoryPictureExample example);

    int updateByPrimaryKeySelective(LoverHistoryPicture record);

    int updateByPrimaryKey(LoverHistoryPicture record);
}