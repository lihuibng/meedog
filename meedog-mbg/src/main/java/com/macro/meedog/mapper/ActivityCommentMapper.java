package com.macro.meedog.mapper;

import com.macro.meedog.model.ActivityComment;
import com.macro.meedog.model.ActivityCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityCommentMapper {
    long countByExample(ActivityCommentExample example);

    int deleteByExample(ActivityCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ActivityComment record);

    int insertSelective(ActivityComment record);

    List<ActivityComment> selectByExample(ActivityCommentExample example);

    ActivityComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ActivityComment record, @Param("example") ActivityCommentExample example);

    int updateByExample(@Param("record") ActivityComment record, @Param("example") ActivityCommentExample example);

    int updateByPrimaryKeySelective(ActivityComment record);

    int updateByPrimaryKey(ActivityComment record);
}