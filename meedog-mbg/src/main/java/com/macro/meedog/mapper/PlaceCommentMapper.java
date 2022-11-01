package com.macro.meedog.mapper;

import com.macro.meedog.model.PlaceComment;
import com.macro.meedog.model.PlaceCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlaceCommentMapper {
    long countByExample(PlaceCommentExample example);

    int deleteByExample(PlaceCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlaceComment record);

    int insertSelective(PlaceComment record);

    List<PlaceComment> selectByExample(PlaceCommentExample example);

    PlaceComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlaceComment record, @Param("example") PlaceCommentExample example);

    int updateByExample(@Param("record") PlaceComment record, @Param("example") PlaceCommentExample example);

    int updateByPrimaryKeySelective(PlaceComment record);

    int updateByPrimaryKey(PlaceComment record);
}