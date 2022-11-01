package com.macro.meedog.search.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.elasticsearch.common.geo.GeoPoint;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 搜索中的人信息
 * Created by macro on 2018/6/19.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Document(indexName = "edu", shards = 16, replicas = 3)
public class EsEducation implements Serializable {
    private static final long serialVersionUID = -1L;

    //@Id
    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Keyword)
    private String uid;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "学位")
    private Integer degree;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "学习国家")
    private Integer abroad;

    //@Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd")
    //@Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss")
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+8")
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(value = "注册时间")
    private Date start;

    //@Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd")
    //@Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss")
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+8")
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(value = "注册时间")
    private Date end;

    @Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "学校")
    private String school;

    @Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "首图ID")
    private String picId;

    @Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "geohash")
    private String geohash;

    @GeoPointField
    @ApiModelProperty(value = "地理位置")
    private GeoPoint location;

    @Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "国家")
    private String country;

    @Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "城市")
    private String city;

    @Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "语言")
    private String language;

    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    @ApiModelProperty(value = "宿舍")
    private String dormitory;

    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    @ApiModelProperty(value = "宿舍")
    private String canteen;

    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    @ApiModelProperty(value = "教学楼")
    private String academicBuilding;

    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    @ApiModelProperty(value = "老师")
    private String teacher;

    @Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "主修")
    private String major;

    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    @ApiModelProperty(value = "描述")
    private String description;

    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    @ApiModelProperty(value = "生活感悟")
    private String livingFeeling;
    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    @ApiModelProperty(value = "成就")
    private String achievement;
    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    @ApiModelProperty(value = "恋爱经历")
    private String loveExperience;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "帐号启用状态:0->禁用；1->启用")
    private Integer status;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "是否毕业")
    private Integer isGraduated;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "是否获取学位")
    private Integer isDegreeGranted;

    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "注册时间")
    private Date createTime;

    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "更新时间")
    private Date modifiedTime;

}
