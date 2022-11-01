package com.macro.meedog.search.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * 搜索中的人信息
 * Created by macro on 2018/6/19.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Document(indexName = "user", shards = 16, replicas = 3)
public class EsUser implements Serializable {
    private static final long serialVersionUID = -1L;

    //@Id
    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Keyword)
    private String uid;

    @Field(type = FieldType.Keyword)
    private String userLevelId;

    @Field(type = FieldType.Keyword)
    private String userBasicInfoId;

    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    @ApiModelProperty(value = "用户名")
    private String username;

    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    //@Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "昵称")
    private String nickname;

    @Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "手机号码")
    private String phone;

    @Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "微信账号")
    private String wechat;

    @Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "微信openid")
    private String openid;

    @Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "微信sessionKey")
    private String sessionKey;

    @Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "email")
    private String email;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "帐号启用状态:0->禁用；1->启用")
    private Integer status;


    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "注册时间")
    private Date createTime;

    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd'T'HH:00:00+08:00||yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "更新时间")
    private Date modifiedTime;

    @Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "头像")
    private String icon;

    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    @ApiModelProperty(value = "个性签名")
    private String personalizedSignature;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "用户来源")
    private Integer sourceType;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "积分")
    private Integer integration;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "成长值")
    private Integer growth;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "剩余抽奖次数")
    private Integer luckyCount;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "历史积分数量")
    private Integer historyIntegration;

    @Field(type = FieldType.Keyword)
    private String gender;

    @Field(type = FieldType.Integer)
    private String degree;

    @Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "封面图id")
    private String picId;

    @Field(type = FieldType.Integer)
    private Integer marriageStatus;

    @Field(type = FieldType.Integer)
    private Integer sexualOrientation;

    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    private String sexualOrientationDesc;

    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+8")
    //@Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd")
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(value = "出生日期")
    private Date birthday;

    @Field(type = FieldType.Keyword)
    private String birthCountry;

    @Field(type = FieldType.Keyword)
    private String birthProvince;

    @Field(type = FieldType.Keyword)
    private String birthCity;

    @Field(type = FieldType.Keyword)
    private String registeredResidenceCountry;

    @Field(type = FieldType.Keyword)
    private String registeredResidenceProvince;

    @Field(type = FieldType.Keyword)
    private String registeredResidenceCity;

    @Field(type = FieldType.Keyword)
    private String residenceCountry;

    @Field(type = FieldType.Keyword)
    private String residenceProvince;

    @Field(type = FieldType.Keyword)
    private String residenceCity;

    @Field(type = FieldType.Keyword)
    private String zodiac;

    @Field(type = FieldType.Keyword)
    private String constellation;

    @Field(type = FieldType.Integer)
    private Integer height;

    @Field(type = FieldType.Integer)
    private Integer weight;

    @Field(type = FieldType.Integer)
    private Integer bmi;

    @Field(type = FieldType.Integer)
    private Integer facialAttractiveness;

    @Field(type = FieldType.Keyword)
    private String industry;

    @Field(type = FieldType.Keyword)
    private String jobType;

    @Field(type = FieldType.Keyword)
    private String nation;

    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    private String jobProof;

    @Field(analyzer = "ik_max_word", type = FieldType.Text)
    private String jobQuestion;

    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "基本信息注册时间")
    private Date basicInfoCreateTime;

    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "基本信息更新时间")
    private Date basicInfoModifiedTime;

    @Field(type = FieldType.Keyword)
    private String assetId;

    @Field(type = FieldType.Integer)
    private Integer asset;

    @Field(type = FieldType.Integer)
    private Integer houseDesc;

    @Field(type = FieldType.Integer)
    private Integer salary;

    @Field(type = FieldType.Integer)
    private Integer score;

    @Field(type = FieldType.Integer)
    private Integer other;

    @Field(type = FieldType.Integer)
    private Integer deposit;

    @Field(type = FieldType.Integer)
    private Integer toprank;

    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "资产基本信息更新时间")
    private Date assetCreateTime;

    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "资产基本信息更新时间")
    private Date assetModifiedTime;

}
