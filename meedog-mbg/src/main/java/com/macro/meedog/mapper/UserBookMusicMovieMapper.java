package com.macro.meedog.mapper;

import com.macro.meedog.model.UserBookMusicMovie;
import com.macro.meedog.model.UserBookMusicMovieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBookMusicMovieMapper {
    long countByExample(UserBookMusicMovieExample example);

    int deleteByExample(UserBookMusicMovieExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserBookMusicMovie record);

    int insertSelective(UserBookMusicMovie record);

    List<UserBookMusicMovie> selectByExample(UserBookMusicMovieExample example);

    UserBookMusicMovie selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserBookMusicMovie record, @Param("example") UserBookMusicMovieExample example);

    int updateByExample(@Param("record") UserBookMusicMovie record, @Param("example") UserBookMusicMovieExample example);

    int updateByPrimaryKeySelective(UserBookMusicMovie record);

    int updateByPrimaryKey(UserBookMusicMovie record);
}