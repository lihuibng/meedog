package com.macro.meedog.mapper;

import com.macro.meedog.model.BookMusicMovieStoryPicture;
import com.macro.meedog.model.BookMusicMovieStoryPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookMusicMovieStoryPictureMapper {
    long countByExample(BookMusicMovieStoryPictureExample example);

    int deleteByExample(BookMusicMovieStoryPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BookMusicMovieStoryPicture record);

    int insertSelective(BookMusicMovieStoryPicture record);

    List<BookMusicMovieStoryPicture> selectByExample(BookMusicMovieStoryPictureExample example);

    BookMusicMovieStoryPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BookMusicMovieStoryPicture record, @Param("example") BookMusicMovieStoryPictureExample example);

    int updateByExample(@Param("record") BookMusicMovieStoryPicture record, @Param("example") BookMusicMovieStoryPictureExample example);

    int updateByPrimaryKeySelective(BookMusicMovieStoryPicture record);

    int updateByPrimaryKey(BookMusicMovieStoryPicture record);
}