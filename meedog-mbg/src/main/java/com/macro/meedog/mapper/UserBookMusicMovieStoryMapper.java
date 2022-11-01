package com.macro.meedog.mapper;

import com.macro.meedog.model.UserBookMusicMovieStory;
import com.macro.meedog.model.UserBookMusicMovieStoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBookMusicMovieStoryMapper {
    long countByExample(UserBookMusicMovieStoryExample example);

    int deleteByExample(UserBookMusicMovieStoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserBookMusicMovieStory record);

    int insertSelective(UserBookMusicMovieStory record);

    List<UserBookMusicMovieStory> selectByExample(UserBookMusicMovieStoryExample example);

    UserBookMusicMovieStory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserBookMusicMovieStory record, @Param("example") UserBookMusicMovieStoryExample example);

    int updateByExample(@Param("record") UserBookMusicMovieStory record, @Param("example") UserBookMusicMovieStoryExample example);

    int updateByPrimaryKeySelective(UserBookMusicMovieStory record);

    int updateByPrimaryKey(UserBookMusicMovieStory record);
}