package com.macro.meedog.mapper;

import com.macro.meedog.model.MarriageStatus;
import com.macro.meedog.model.MarriageStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarriageStatusMapper {
    long countByExample(MarriageStatusExample example);

    int deleteByExample(MarriageStatusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MarriageStatus record);

    int insertSelective(MarriageStatus record);

    List<MarriageStatus> selectByExample(MarriageStatusExample example);

    MarriageStatus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MarriageStatus record, @Param("example") MarriageStatusExample example);

    int updateByExample(@Param("record") MarriageStatus record, @Param("example") MarriageStatusExample example);

    int updateByPrimaryKeySelective(MarriageStatus record);

    int updateByPrimaryKey(MarriageStatus record);
}