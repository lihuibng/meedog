package com.macro.meedog.server.domain.vo;

import com.macro.meedog.model.UserEduExperience;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author "xxxxxx"
 * @modified 2021/3/7 11:04 下午
 */

@Data
public class UserEduExperienceVo {
    @ApiModelProperty(value = "学习经历id")
    private String id;

    @ApiModelProperty(value = "uid")
    private String uid;

    @ApiModelProperty(value = "0: 没读过书 1: 小学 2: 初中 3: 中专 4: 高中 5: 大专 6: 成人本科 7: 本科 8: 研究生 9: 在职研究生 10: MBA 11: 博士 12: 博士后 13: 其他")
    private Integer degree;

    @ApiModelProperty(value = "0: 国内 1: 港澳台 2: 美国 3: 加拿大 4: 英国 5: 欧洲 6: 澳洲 7: 其他")
    private Integer abroad;

    @ApiModelProperty(value = "开始")
    private Date start;

    @ApiModelProperty(value = "结束")
    private Date end;

    @ApiModelProperty(value = "学校")
    private String school;

    @ApiModelProperty(value = "首图ID")
    private String picId;

    @ApiModelProperty(value = "是否毕业, 0 未毕业, 1 毕业")
    private Integer isGraduated;

    @ApiModelProperty(value = "是否取得学位, 0 未取得, 1 取得")
    private Integer isDegreeGranted;

    @ApiModelProperty(value = "经度")
    private Double longitude;

    @ApiModelProperty(value = "纬度")
    private Double latitude;

    @ApiModelProperty(value = "国家")
    private String country;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "语言")
    private String language;

    @ApiModelProperty(value = "食堂")
    private String canteen;

    @ApiModelProperty(value = "宿舍")
    private String dormitory;

    @ApiModelProperty(value = "教学楼")
    private String academicBuilding;

    @ApiModelProperty(value = "熟悉老师")
    private String teacher;

    @ApiModelProperty(value = "专业")
    private String major;

    @ApiModelProperty(value = "生活感想or记忆深刻or刻骨爱情or自豪的事")
    private String description;

    @ApiModelProperty(value = "生活感想")
    private String livingFeeling;

    @ApiModelProperty(value = "学习、实习成绩、自豪的事情")
    private String achievement;

    @ApiModelProperty(value = "恋爱经验")
    private String loveExperience;

    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifiedTime;

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "图片ID")
    private List<String> picIds;

    static public UserEduExperience viewToModel(UserEduExperienceVo v) {
        UserEduExperience u = new UserEduExperience();
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

    static public UserEduExperienceVo modelToView(UserEduExperience u) {
        UserEduExperienceVo v = new UserEduExperienceVo();
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

    static public List<UserEduExperience> viewToModel(List<UserEduExperienceVo> vList) {
        List<UserEduExperience> uList = new ArrayList<UserEduExperience>();
        for (UserEduExperienceVo v : vList) {
            uList.add(UserEduExperienceVo.viewToModel(v));
        }
        return uList;
    }

    static public List<UserEduExperienceVo> modelToView(List<UserEduExperience> uList) {
        List<UserEduExperienceVo> vList = new ArrayList<UserEduExperienceVo>();
        for (UserEduExperience u : uList) {
            vList.add(UserEduExperienceVo.modelToView(u));
        }
        return vList;
    }
}

