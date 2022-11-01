package com.macro.meedog.server.domain.vo;

import com.macro.meedog.model.UserBasicInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author "xxxxxx"
 * @modified 2021/3/7 10:15 下午
 */

@Data
public class UserBasicInfoVo {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "用户基本信息ID")
    private String id;

    @ApiModelProperty(value = "用户ID")
    private String uid;

    @ApiModelProperty(value = "性别 1: 男 2: 女 3: 未知")
    private Integer gender;

    @ApiModelProperty(value = "封面图id")
    private String picId;

    @ApiModelProperty(value = "婚姻状态")
    private Integer marriageStatus;

    @ApiModelProperty(value = "民族")
    private String nation;

    @ApiModelProperty(value = "性取向 1: 异性恋 2: 同性恋 3: 双性恋")
    private Integer sexualOrientation;

    @ApiModelProperty(value = "性取向备注, 结不结婚婚，要不要娃")
    private String sexualOrientationDesc;

    @ApiModelProperty(value = "生日")
    private Date birthday;

    @ApiModelProperty(value = "出生国家")
    private String birthCountry;

    @ApiModelProperty(value = "出生省份")
    private String birthProvince;

    @ApiModelProperty(value = "出生城市")
    private String birthCity;

    @ApiModelProperty(value = "户籍国家")
    private String registeredResidenceCountry;

    @ApiModelProperty(value = "户籍省份")
    private String registeredResidenceProvince;

    @ApiModelProperty(value = "户籍城市")
    private String registeredResidenceCity;

    @ApiModelProperty(value = "工作国家")
    private String residenceCountry;

    @ApiModelProperty(value = "工作省")
    private String residenceProvince;

    @ApiModelProperty(value = "工作城市")
    private String residenceCity;

    @ApiModelProperty(value = "属相")
    private String zodiac;

    @ApiModelProperty(value = "星座")
    private String constellation;

    @ApiModelProperty(value = "身高 厘米")
    private Integer height;

    @ApiModelProperty(value = "体重 斤")
    private Integer weight;

    @ApiModelProperty(value = "bmi值 * 100")
    private Integer bmi;

    @ApiModelProperty(value = "颜值")
    private Integer facialAttractiveness;

    @ApiModelProperty(value = "工作行业")
    private String industry;

    @ApiModelProperty(value = "工作职务")
    private String jobType;

    @ApiModelProperty(value = "一句话或者代码证明自己的职业")
    private String jobProof;

    @ApiModelProperty(value = "为同行留一个专业问题吧？")
    private String jobQuestion;

    @ApiModelProperty(value = "图片ID")
    private List<String> picIds;

    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifiedTime;


    static public UserBasicInfo viewToModel(UserBasicInfoVo v) {
        UserBasicInfo u = new UserBasicInfo();
        BeanUtils.copyProperties(v, u);
        if (v.getId() != null) {
            u.setId(Long.parseLong(v.getId()));
        }
        if (v.getUid() != null) {
            u.setUid(Long.parseLong(v.getUid()));
        }
        if (v.getPicId() != null) {
            u.setPicId(Long.parseLong(v.getPicId()));
        }
        return u;
    }

    static public UserBasicInfoVo modelToView(UserBasicInfo u) {
        UserBasicInfoVo v = new UserBasicInfoVo();
        BeanUtils.copyProperties(u, v);
        if (u.getId() != null) {
            v.setId(String.valueOf(u.getId()));
        }
        if (u.getUid() != null) {
            v.setUid(String.valueOf(u.getUid()));
        }
        if (u.getPicId() != null) {
            v.setPicId(String.valueOf(u.getPicId()));
        }
        return v;
    }

    static public List<UserBasicInfo> viewToModel(List<UserBasicInfoVo> vList) {
        List<UserBasicInfo> uList = new ArrayList<UserBasicInfo>();
        for (UserBasicInfoVo v : vList) {
            uList.add(UserBasicInfoVo.viewToModel(v));
        }
        return uList;
    }

    static public List<UserBasicInfoVo> modelToView(List<UserBasicInfo> uList) {
        List<UserBasicInfoVo> vList = new ArrayList<UserBasicInfoVo>();
        for (UserBasicInfo u : uList) {
            vList.add(UserBasicInfoVo.modelToView(u));
        }
        return vList;
    }
}
