package com.macro.meedog.model;

import com.macro.meedog.common.geo.GeoPoint;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AssetBenchmark implements Serializable {
    @ApiModelProperty(value = "user asset salary")
    private Long id;

    @ApiModelProperty(value = "省id")
    private Long provinceId;

    @ApiModelProperty(value = "省")
    private String province;

    @ApiModelProperty(value = "城市id")
    private Long cityId;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "城市级别")
    private Integer cityLevel;

    @ApiModelProperty(value = "区ID")
    private Integer districtId;

    @ApiModelProperty(value = "区")
    private String district;

    @ApiModelProperty(value = "地理位置")
    private GeoPoint location;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "街道,门牌号")
    private String street;

    @ApiModelProperty(value = "国家")
    private String country;

    @ApiModelProperty(value = "标签")
    private Byte tag;

    @ApiModelProperty(value = "房产基准线 15年收入")
    private Integer houseBenchmark;

    @ApiModelProperty(value = "收入基准线 40w")
    private Integer salaryBenchmark;

    @ApiModelProperty(value = "储蓄基准线 5年收入")
    private Integer depositBenchmark;

    @ApiModelProperty(value = "其他收入基准线 车1年收入")
    private Integer otherAssetBenchmark;

    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifiedTime;

    @ApiModelProperty(value = "城市平均房价")
    private Integer cityHouseBenchmark;

    @ApiModelProperty(value = "区平均房价")
    private Integer areaHouseBenchmark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getCityLevel() {
        return cityLevel;
    }

    public void setCityLevel(Integer cityLevel) {
        this.cityLevel = cityLevel;
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

    public GeoPoint getLocation() {
        return location;
    }

    public void setLocation(GeoPoint location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Byte getTag() {
        return tag;
    }

    public void setTag(Byte tag) {
        this.tag = tag;
    }

    public Integer getHouseBenchmark() {
        return houseBenchmark;
    }

    public void setHouseBenchmark(Integer houseBenchmark) {
        this.houseBenchmark = houseBenchmark;
    }

    public Integer getSalaryBenchmark() {
        return salaryBenchmark;
    }

    public void setSalaryBenchmark(Integer salaryBenchmark) {
        this.salaryBenchmark = salaryBenchmark;
    }

    public Integer getDepositBenchmark() {
        return depositBenchmark;
    }

    public void setDepositBenchmark(Integer depositBenchmark) {
        this.depositBenchmark = depositBenchmark;
    }

    public Integer getOtherAssetBenchmark() {
        return otherAssetBenchmark;
    }

    public void setOtherAssetBenchmark(Integer otherAssetBenchmark) {
        this.otherAssetBenchmark = otherAssetBenchmark;
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

    public Integer getCityHouseBenchmark() {
        return cityHouseBenchmark;
    }

    public void setCityHouseBenchmark(Integer cityHouseBenchmark) {
        this.cityHouseBenchmark = cityHouseBenchmark;
    }

    public Integer getAreaHouseBenchmark() {
        return areaHouseBenchmark;
    }

    public void setAreaHouseBenchmark(Integer areaHouseBenchmark) {
        this.areaHouseBenchmark = areaHouseBenchmark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", province=").append(province);
        sb.append(", cityId=").append(cityId);
        sb.append(", city=").append(city);
        sb.append(", cityLevel=").append(cityLevel);
        sb.append(", districtId=").append(districtId);
        sb.append(", district=").append(district);
        sb.append(", location=").append(location);
        sb.append(", address=").append(address);
        sb.append(", street=").append(street);
        sb.append(", country=").append(country);
        sb.append(", tag=").append(tag);
        sb.append(", houseBenchmark=").append(houseBenchmark);
        sb.append(", salaryBenchmark=").append(salaryBenchmark);
        sb.append(", depositBenchmark=").append(depositBenchmark);
        sb.append(", otherAssetBenchmark=").append(otherAssetBenchmark);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", cityHouseBenchmark=").append(cityHouseBenchmark);
        sb.append(", areaHouseBenchmark=").append(areaHouseBenchmark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}