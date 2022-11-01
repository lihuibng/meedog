package com.macro.meedog.mapper;

import com.macro.meedog.model.UserWeiboPicture;
import com.macro.meedog.model.UserWeiboPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWeiboPictureMapper {
    long countByExample(UserWeiboPictureExample example);

    int deleteByExample(UserWeiboPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserWeiboPicture record);

    int insertSelective(UserWeiboPicture record);

    List<UserWeiboPicture> selectByExample(UserWeiboPictureExample example);

    UserWeiboPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserWeiboPicture record, @Param("example") UserWeiboPictureExample example);

    int updateByExample(@Param("record") UserWeiboPicture record, @Param("example") UserWeiboPictureExample example);

    int updateByPrimaryKeySelective(UserWeiboPicture record);

    int updateByPrimaryKey(UserWeiboPicture record);
}