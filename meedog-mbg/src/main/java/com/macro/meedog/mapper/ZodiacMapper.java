package com.macro.meedog.mapper;

import com.macro.meedog.model.Zodiac;
import com.macro.meedog.model.ZodiacExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZodiacMapper {
    long countByExample(ZodiacExample example);

    int deleteByExample(ZodiacExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Zodiac record);

    int insertSelective(Zodiac record);

    List<Zodiac> selectByExample(ZodiacExample example);

    Zodiac selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Zodiac record, @Param("example") ZodiacExample example);

    int updateByExample(@Param("record") Zodiac record, @Param("example") ZodiacExample example);

    int updateByPrimaryKeySelective(Zodiac record);

    int updateByPrimaryKey(Zodiac record);
}