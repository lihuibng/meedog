package com.macro.meedog.model;

import com.macro.meedog.common.geo.GeoPoint;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserEduExperience implements Serializable {
    @ApiModelProperty(value = "学习经历id")
    private Long id;

    @ApiModelProperty(value = "uid")
    private Long uid;

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
    private Long picId;

    @ApiModelProperty(value = "是否毕业, 0 未毕业, 1 毕业")
    private Integer isGraduated;

    @ApiModelProperty(value = "是否取得学位, 0 未取得, 1 取得")
    private Integer isDegreeGranted;

    @ApiModelProperty(value = "地理位置")
    private GeoPoint location;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public Integer getAbroad() {
        return abroad;
    }

    public void setAbroad(Integer abroad) {
        this.abroad = abroad;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public Long getPicId() {
        return picId;
    }

    public void setPicId(Long picId) {
        this.picId = picId;
    }

    public Integer getIsGraduated() {
        return isGraduated;
    }

    public void setIsGraduated(Integer isGraduated) {
        this.isGraduated = isGraduated;
    }

    public Integer getIsDegreeGranted() {
        return isDegreeGranted;
    }

    public void setIsDegreeGranted(Integer isDegreeGranted) {
        this.isDegreeGranted = isDegreeGranted;
    }

    public GeoPoint getLocation() {
        return location;
    }

    public void setLocation(GeoPoint location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getCanteen() {
        return canteen;
    }

    public void setCanteen(String canteen) {
        this.canteen = canteen == null ? null : canteen.trim();
    }

    public String getDormitory() {
        return dormitory;
    }

    public void setDormitory(String dormitory) {
        this.dormitory = dormitory == null ? null : dormitory.trim();
    }

    public String getAcademicBuilding() {
        return academicBuilding;
    }

    public void setAcademicBuilding(String academicBuilding) {
        this.academicBuilding = academicBuilding == null ? null : academicBuilding.trim();
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLivingFeeling() {
        return livingFeeling;
    }

    public void setLivingFeeling(String livingFeeling) {
        this.livingFeeling = livingFeeling == null ? null : livingFeeling.trim();
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement == null ? null : achievement.trim();
    }

    public String getLoveExperience() {
        return loveExperience;
    }

    public void setLoveExperience(String loveExperience) {
        this.loveExperience = loveExperience == null ? null : loveExperience.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", degree=").append(degree);
        sb.append(", abroad=").append(abroad);
        sb.append(", start=").append(start);
        sb.append(", end=").append(end);
        sb.append(", school=").append(school);
        sb.append(", picId=").append(picId);
        sb.append(", isGraduated=").append(isGraduated);
        sb.append(", isDegreeGranted=").append(isDegreeGranted);
        sb.append(", location=").append(location);
        sb.append(", country=").append(country);
        sb.append(", city=").append(city);
        sb.append(", language=").append(language);
        sb.append(", canteen=").append(canteen);
        sb.append(", dormitory=").append(dormitory);
        sb.append(", academicBuilding=").append(academicBuilding);
        sb.append(", teacher=").append(teacher);
        sb.append(", major=").append(major);
        sb.append(", description=").append(description);
        sb.append(", livingFeeling=").append(livingFeeling);
        sb.append(", achievement=").append(achievement);
        sb.append(", loveExperience=").append(loveExperience);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}