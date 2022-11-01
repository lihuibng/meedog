package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class WorldCity implements Serializable {
    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "国家ID")
    private Long countryId;

    @ApiModelProperty(value = "国家ID")
    private String countryCode;

    @ApiModelProperty(value = "中文简称")
    private String chineseCountryName;

    @ApiModelProperty(value = "英文简称")
    private String englishCountryName;

    @ApiModelProperty(value = "省ID")
    private String stateCode;

    @ApiModelProperty(value = "中文简称")
    private String chineseStateName;

    @ApiModelProperty(value = "英文简称")
    private String englishStateName;

    @ApiModelProperty(value = "城市ID")
    private String cityCode;

    @ApiModelProperty(value = "中文简称")
    private String chineseCityName;

    @ApiModelProperty(value = "英文简称")
    private String englishCityName;

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

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getChineseCountryName() {
        return chineseCountryName;
    }

    public void setChineseCountryName(String chineseCountryName) {
        this.chineseCountryName = chineseCountryName == null ? null : chineseCountryName.trim();
    }

    public String getEnglishCountryName() {
        return englishCountryName;
    }

    public void setEnglishCountryName(String englishCountryName) {
        this.englishCountryName = englishCountryName == null ? null : englishCountryName.trim();
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode == null ? null : stateCode.trim();
    }

    public String getChineseStateName() {
        return chineseStateName;
    }

    public void setChineseStateName(String chineseStateName) {
        this.chineseStateName = chineseStateName == null ? null : chineseStateName.trim();
    }

    public String getEnglishStateName() {
        return englishStateName;
    }

    public void setEnglishStateName(String englishStateName) {
        this.englishStateName = englishStateName == null ? null : englishStateName.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getChineseCityName() {
        return chineseCityName;
    }

    public void setChineseCityName(String chineseCityName) {
        this.chineseCityName = chineseCityName == null ? null : chineseCityName.trim();
    }

    public String getEnglishCityName() {
        return englishCityName;
    }

    public void setEnglishCityName(String englishCityName) {
        this.englishCityName = englishCityName == null ? null : englishCityName.trim();
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
        sb.append(", countryId=").append(countryId);
        sb.append(", countryCode=").append(countryCode);
        sb.append(", chineseCountryName=").append(chineseCountryName);
        sb.append(", englishCountryName=").append(englishCountryName);
        sb.append(", stateCode=").append(stateCode);
        sb.append(", chineseStateName=").append(chineseStateName);
        sb.append(", englishStateName=").append(englishStateName);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", chineseCityName=").append(chineseCityName);
        sb.append(", englishCityName=").append(englishCityName);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}