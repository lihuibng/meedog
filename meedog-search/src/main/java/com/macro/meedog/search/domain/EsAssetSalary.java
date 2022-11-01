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

@Data
@EqualsAndHashCode(callSuper = false)
@Document(indexName = "asset", shards = 16, replicas = 3)
public class EsAssetSalary implements Serializable {
    private static final long serialVersionUID = -1L;

   // @Id
    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Keyword)
    private String uid;

    @Field(type = FieldType.Keyword)
    @ApiModelProperty(value = "房产描述")
    private String houseDesc;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "固定资产")
    private Integer asset;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "收入")
    private Integer salary;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "储蓄")
    private Integer deposit;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "其他")
    private Integer other;


    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "分值")
    private Integer score;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "排位")
    private Integer toprank;

    @Field(type = FieldType.Integer)
    @ApiModelProperty(value = "帐号启用状态:0->禁用；1->启用")
    private Integer status;

    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "注册时间")
    private Date createTime;

    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.S||yyyy-MM-dd||yyyy-MM-dd'T'HH:mm:ss.SSS||yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "更新时间")
    private Date modifiedTime;
}
