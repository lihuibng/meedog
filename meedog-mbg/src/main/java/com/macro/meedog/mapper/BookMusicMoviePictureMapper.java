package com.macro.meedog.mapper;

import com.macro.meedog.model.BookMusicMoviePicture;
import com.macro.meedog.model.BookMusicMoviePictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookMusicMoviePictureMapper {
    long countByExample(BookMusicMoviePictureExample example);

    int deleteByExample(BookMusicMoviePictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BookMusicMoviePicture record);

    int insertSelective(BookMusicMoviePicture record);

    List<BookMusicMoviePicture> selectByExample(BookMusicMoviePictureExample example);

    BookMusicMoviePicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BookMusicMoviePicture record, @Param("example") BookMusicMoviePictureExample example);

    int updateByExample(@Param("record") BookMusicMoviePicture record, @Param("example") BookMusicMoviePictureExample example);

    int updateByPrimaryKeySelective(BookMusicMoviePicture record);

    int updateByPrimaryKey(BookMusicMoviePicture record);
}