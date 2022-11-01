package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserBasicInfo implements Serializable {
    @ApiModelProperty(value = "用户基本信息ID")
    private Long id;

    @ApiModelProperty(value = "用户ID")
    private Long uid;

    @ApiModelProperty(value = "性别 1: 男 2: 女 3: 未知")
    private Integer gender;

    @ApiModelProperty(value = "学历")
    private Integer degree;

    @ApiModelProperty(value = "封面图id")
    private Long picId;

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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public Long getPicId() {
        return picId;
    }

    public void setPicId(Long picId) {
        this.picId = picId;
    }

    public Integer getMarriageStatus() {
        return marriageStatus;
    }

    public void setMarriageStatus(Integer marriageStatus) {
        this.marriageStatus = marriageStatus;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public Integer getSexualOrientation() {
        return sexualOrientation;
    }

    public void setSexualOrientation(Integer sexualOrientation) {
        this.sexualOrientation = sexualOrientation;
    }

    public String getSexualOrientationDesc() {
        return sexualOrientationDesc;
    }

    public void setSexualOrientationDesc(String sexualOrientationDesc) {
        this.sexualOrientationDesc = sexualOrientationDesc == null ? null : sexualOrientationDesc.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry == null ? null : birthCountry.trim();
    }

    public String getBirthProvince() {
        return birthProvince;
    }

    public void setBirthProvince(String birthProvince) {
        this.birthProvince = birthProvince == null ? null : birthProvince.trim();
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity == null ? null : birthCity.trim();
    }

    public String getRegisteredResidenceCountry() {
        return registeredResidenceCountry;
    }

    public void setRegisteredResidenceCountry(String registeredResidenceCountry) {
        this.registeredResidenceCountry = registeredResidenceCountry == null ? null : registeredResidenceCountry.trim();
    }

    public String getRegisteredResidenceProvince() {
        return registeredResidenceProvince;
    }

    public void setRegisteredResidenceProvince(String registeredResidenceProvince) {
        this.registeredResidenceProvince = registeredResidenceProvince == null ? null : registeredResidenceProvince.trim();
    }

    public String getRegisteredResidenceCity() {
        return registeredResidenceCity;
    }

    public void setRegisteredResidenceCity(String registeredResidenceCity) {
        this.registeredResidenceCity = registeredResidenceCity == null ? null : registeredResidenceCity.trim();
    }

    public String getResidenceCountry() {
        return residenceCountry;
    }

    public void setResidenceCountry(String residenceCountry) {
        this.residenceCountry = residenceCountry == null ? null : residenceCountry.trim();
    }

    public String getResidenceProvince() {
        return residenceProvince;
    }

    public void setResidenceProvince(String residenceProvince) {
        this.residenceProvince = residenceProvince == null ? null : residenceProvince.trim();
    }

    public String getResidenceCity() {
        return residenceCity;
    }

    public void setResidenceCity(String residenceCity) {
        this.residenceCity = residenceCity == null ? null : residenceCity.trim();
    }

    public String getZodiac() {
        return zodiac;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac == null ? null : zodiac.trim();
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation == null ? null : constellation.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getBmi() {
        return bmi;
    }

    public void setBmi(Integer bmi) {
        this.bmi = bmi;
    }

    public Integer getFacialAttractiveness() {
        return facialAttractiveness;
    }

    public void setFacialAttractiveness(Integer facialAttractiveness) {
        this.facialAttractiveness = facialAttractiveness;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType == null ? null : jobType.trim();
    }

    public String getJobProof() {
        return jobProof;
    }

    public void setJobProof(String jobProof) {
        this.jobProof = jobProof == null ? null : jobProof.trim();
    }

    public String getJobQuestion() {
        return jobQuestion;
    }

    public void setJobQuestion(String jobQuestion) {
        this.jobQuestion = jobQuestion == null ? null : jobQuestion.trim();
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
        sb.append(", gender=").append(gender);
        sb.append(", degree=").append(degree);
        sb.append(", picId=").append(picId);
        sb.append(", marriageStatus=").append(marriageStatus);
        sb.append(", nation=").append(nation);
        sb.append(", sexualOrientation=").append(sexualOrientation);
        sb.append(", sexualOrientationDesc=").append(sexualOrientationDesc);
        sb.append(", birthday=").append(birthday);
        sb.append(", birthCountry=").append(birthCountry);
        sb.append(", birthProvince=").append(birthProvince);
        sb.append(", birthCity=").append(birthCity);
        sb.append(", registeredResidenceCountry=").append(registeredResidenceCountry);
        sb.append(", registeredResidenceProvince=").append(registeredResidenceProvince);
        sb.append(", registeredResidenceCity=").append(registeredResidenceCity);
        sb.append(", residenceCountry=").append(residenceCountry);
        sb.append(", residenceProvince=").append(residenceProvince);
        sb.append(", residenceCity=").append(residenceCity);
        sb.append(", zodiac=").append(zodiac);
        sb.append(", constellation=").append(constellation);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", bmi=").append(bmi);
        sb.append(", facialAttractiveness=").append(facialAttractiveness);
        sb.append(", industry=").append(industry);
        sb.append(", jobType=").append(jobType);
        sb.append(", jobProof=").append(jobProof);
        sb.append(", jobQuestion=").append(jobQuestion);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}