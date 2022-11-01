package com.macro.meedog.model;

import com.macro.meedog.common.geo.GeoPoint;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class WorldCountry implements Serializable {
    @ApiModelProperty(value = "国家ID")
    private Long id;

    @ApiModelProperty(value = "中文简称")
    private String chineseName;

    @ApiModelProperty(value = "National Comprehensive Power")
    private Integer ncp;

    @ApiModelProperty(value = "population")
    private String logoLink;

    @ApiModelProperty(value = "population")
    private String picture;

    @ApiModelProperty(value = "英文简称")
    private String englishName;

    @ApiModelProperty(value = "英文全称")
    private String englishFullName;

    @ApiModelProperty(value = "GDP")
    private Double gdp;

    @ApiModelProperty(value = "population")
    private Double population;

    @ApiModelProperty(value = "population")
    private Integer gdpPerCapita;

    @ApiModelProperty(value = "两字母简称")
    private String letter2Name;

    @ApiModelProperty(value = "三字母简称")
    private String letter3Name;

    @ApiModelProperty(value = "数字简称")
    private Integer digitCode;

    @ApiModelProperty(value = "旧数字简称")
    private Integer oldDigitCode;

    @ApiModelProperty(value = "地理位置")
    private GeoPoint location;

    @ApiModelProperty(value = "首都")
    private String capital;

    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;

    @ApiModelProperty(value = "活动创建时间")
    private Date createTime;

    @ApiModelProperty(value = "活动修改时间")
    private Date modifiedTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName == null ? null : chineseName.trim();
    }

    public Integer getNcp() {
        return ncp;
    }

    public void setNcp(Integer ncp) {
        this.ncp = ncp;
    }

    public String getLogoLink() {
        return logoLink;
    }

    public void setLogoLink(String logoLink) {
        this.logoLink = logoLink == null ? null : logoLink.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getEnglishFullName() {
        return englishFullName;
    }

    public void setEnglishFullName(String englishFullName) {
        this.englishFullName = englishFullName == null ? null : englishFullName.trim();
    }

    public Double getGdp() {
        return gdp;
    }

    public void setGdp(Double gdp) {
        this.gdp = gdp;
    }

    public Double getPopulation() {
        return population;
    }

    public void setPopulation(Double population) {
        this.population = population;
    }

    public Integer getGdpPerCapita() {
        return gdpPerCapita;
    }

    public void setGdpPerCapita(Integer gdpPerCapita) {
        this.gdpPerCapita = gdpPerCapita;
    }

    public String getLetter2Name() {
        return letter2Name;
    }

    public void setLetter2Name(String letter2Name) {
        this.letter2Name = letter2Name == null ? null : letter2Name.trim();
    }

    public String getLetter3Name() {
        return letter3Name;
    }

    public void setLetter3Name(String letter3Name) {
        this.letter3Name = letter3Name == null ? null : letter3Name.trim();
    }

    public Integer getDigitCode() {
        return digitCode;
    }

    public void setDigitCode(Integer digitCode) {
        this.digitCode = digitCode;
    }

    public Integer getOldDigitCode() {
        return oldDigitCode;
    }

    public void setOldDigitCode(Integer oldDigitCode) {
        this.oldDigitCode = oldDigitCode;
    }

    public GeoPoint getLocation() {
        return location;
    }

    public void setLocation(GeoPoint location) {
        this.location = location;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital == null ? null : capital.trim();
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
        sb.append(", chineseName=").append(chineseName);
        sb.append(", ncp=").append(ncp);
        sb.append(", logoLink=").append(logoLink);
        sb.append(", picture=").append(picture);
        sb.append(", englishName=").append(englishName);
        sb.append(", englishFullName=").append(englishFullName);
        sb.append(", gdp=").append(gdp);
        sb.append(", population=").append(population);
        sb.append(", gdpPerCapita=").append(gdpPerCapita);
        sb.append(", letter2Name=").append(letter2Name);
        sb.append(", letter3Name=").append(letter3Name);
        sb.append(", digitCode=").append(digitCode);
        sb.append(", oldDigitCode=").append(oldDigitCode);
        sb.append(", location=").append(location);
        sb.append(", capital=").append(capital);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}