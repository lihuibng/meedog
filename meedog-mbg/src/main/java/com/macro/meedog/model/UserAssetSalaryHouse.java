package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserAssetSalaryHouse implements Serializable {
    @ApiModelProperty(value = "user asset salary 房产")
    private Long id;

    @ApiModelProperty(value = "资产收入id")
    private Long assetSalaryId;

    @ApiModelProperty(value = "国家")
    private String country;

    @ApiModelProperty(value = "省Id")
    private Integer provinceId;

    @ApiModelProperty(value = "国家")
    private String province;

    @ApiModelProperty(value = "城市ID")
    private Integer cityId;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "区ID")
    private Integer districtId;

    @ApiModelProperty(value = "区")
    private String district;

    @ApiModelProperty(value = "大致地铁")
    private String metroStation;

    @ApiModelProperty(value = "地名")
    private String wellKnowAddress;

    @ApiModelProperty(value = "房子总价")
    private Integer housePrice;

    @ApiModelProperty(value = "是否学区, 上地实验小学")
    private String schoolEstate;

    @ApiModelProperty(value = "几环或者离市中心距离")
    private String nearCenter;

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

    public Long getAssetSalaryId() {
        return assetSalaryId;
    }

    public void setAssetSalaryId(Long assetSalaryId) {
        this.assetSalaryId = assetSalaryId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
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

    public Integer getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(Integer housePrice) {
        this.housePrice = housePrice;
    }

    public String getSchoolEstate() {
        return schoolEstate;
    }

    public void setSchoolEstate(String schoolEstate) {
        this.schoolEstate = schoolEstate == null ? null : schoolEstate.trim();
    }

    public String getNearCenter() {
        return nearCenter;
    }

    public void setNearCenter(String nearCenter) {
        this.nearCenter = nearCenter == null ? null : nearCenter.trim();
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
        sb.append(", assetSalaryId=").append(assetSalaryId);
        sb.append(", country=").append(country);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", province=").append(province);
        sb.append(", cityId=").append(cityId);
        sb.append(", city=").append(city);
        sb.append(", districtId=").append(districtId);
        sb.append(", district=").append(district);
        sb.append(", metroStation=").append(metroStation);
        sb.append(", wellKnowAddress=").append(wellKnowAddress);
        sb.append(", housePrice=").append(housePrice);
        sb.append(", schoolEstate=").append(schoolEstate);
        sb.append(", nearCenter=").append(nearCenter);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}