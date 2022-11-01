package com.macro.meedog.search.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * 搜索中的商品属性信息
 * Created by macro on 2018/6/27.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EsBasicInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long uid;
    //属性值
    @Field(type = FieldType.Keyword)
    private String gender;
    //属性参数：0->规格；1->参数
    @Field(type = FieldType.Keyword)
    private Integer sexualOrientation;
    @Field(type = FieldType.Keyword)
    private String sexualOrientationDesc;
    @Field(type = FieldType.Keyword)
    private Date birthday;
    @Field(type = FieldType.Keyword)
    private String birthPlace;
    @Field(type = FieldType.Keyword)
    private String registeredResidence;
    @Field(type = FieldType.Keyword)
    private String residence;
    @Field(type = FieldType.Keyword)
    private String planResidence;
    @Field(type = FieldType.Keyword)
    private String zodiac;
    @Field(type = FieldType.Keyword)
    private String constellation;
    private Integer height;
    private Integer weight;
    private Integer bmi;
    private Integer facialAttractiveness;
    @Field(type = FieldType.Keyword)
    private String jobType;
    private int status;
}
