package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserFamily implements Serializable {
    @ApiModelProperty(value = "user 家庭")
    private Long id;

    @ApiModelProperty(value = "uid")
    private Long uid;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "是否是父亲")
    private Integer isFather;

    @ApiModelProperty(value = "是否是母亲")
    private Integer isMother;

    @ApiModelProperty(value = "国家")
    private String country;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "区")
    private String district;

    @ApiModelProperty(value = "镇")
    private String town;

    @ApiModelProperty(value = "距离近地铁")
    private String metroStation;

    @ApiModelProperty(value = "地名")
    private String wellKnowAddress;

    @ApiModelProperty(value = "业余收入")
    private Integer income;

    @ApiModelProperty(value = "医保")
    private Integer medicalInsurance;

    @ApiModelProperty(value = "社保指养老金")
    private Integer socialInsurance;

    @ApiModelProperty(value = "家里几口人")
    private Integer totalPeople;

    @ApiModelProperty(value = "家庭情况")
    private String description;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getIsFather() {
        return isFather;
    }

    public void setIsFather(Integer isFather) {
        this.isFather = isFather;
    }

    public Integer getIsMother() {
        return isMother;
    }

    public void setIsMother(Integer isMother) {
        this.isMother = isMother;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town == null ? null : town.trim();
    }

    public String getMetroStation() {
        return metroStation;
    }

    public void setMetroStation(String metroStation) {
        this.metroStation = metroStation == null ? null : metroStation.trim();
    }

    public String getWellKnowAddress() {
        return wellKnowAddress;
    }

    public void setWellKnowAddress(String wellKnowAddress) {
        this.wellKnowAddress = wellKnowAddress == null ? null : wellKnowAddress.trim();
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(Integer medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    public Integer getSocialInsurance() {
        return socialInsurance;
    }

    public void setSocialInsurance(Integer socialInsurance) {
        this.socialInsurance = socialInsurance;
    }

    public Integer getTotalPeople() {
        return totalPeople;
    }

    public void setTotalPeople(Integer totalPeople) {
        this.totalPeople = totalPeople;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
        sb.append(", age=").append(age);
        sb.append(", isFather=").append(isFather);
        sb.append(", isMother=").append(isMother);
        sb.append(", country=").append(country);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", town=").append(town);
        sb.append(", metroStation=").append(metroStation);
        sb.append(", wellKnowAddress=").append(wellKnowAddress);
        sb.append(", income=").append(income);
        sb.append(", medicalInsurance=").append(medicalInsurance);
        sb.append(", socialInsurance=").append(socialInsurance);
        sb.append(", totalPeople=").append(totalPeople);
        sb.append(", description=").append(description);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}