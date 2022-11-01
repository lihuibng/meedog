package com.macro.meedog.model;

import com.macro.meedog.common.geo.GeoPoint;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserCity implements Serializable {
    @ApiModelProperty(value = "user city")
    private Long id;

    @ApiModelProperty(value = "城市id")
    private Long cid;

    @ApiModelProperty(value = "上级城市id, 0表示省会或者直辖市")
    private Long pcid;

    @ApiModelProperty(value = "国家")
    private String country;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "地理位置")
    private GeoPoint location;

    @ApiModelProperty(value = "人口")
    private Integer population;

    @ApiModelProperty(value = "GDP")
    private Integer gdp;

    @ApiModelProperty(value = "人均GDP")
    private Integer avgGdp;

    @ApiModelProperty(value = "单身男士")
    private Integer singleMaleNum;

    @ApiModelProperty(value = "单身女士")
    private Integer singleFemaleNum;

    @ApiModelProperty(value = "人均收入")
    private Integer avgIncome;

    @ApiModelProperty(value = "几线城市")
    private Integer level;

    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifiedTime;

    @ApiModelProperty(value = "城市评分")
    private Integer cityScore;

    @ApiModelProperty(value = "城市排名")
    private Integer cityRank;

    @ApiModelProperty(value = "城市平均房价")
    private Integer housePrice;

    @ApiModelProperty(value = "城市平均总价")
    private Integer houseBenchmark;

    @ApiModelProperty(value = "平均年收入")
    private Integer salaryBenchmark;

    @ApiModelProperty(value = "平均总存款")
    private Integer depositBenchmark;

    @ApiModelProperty(value = "其他收入、股权、汽车、游艇、期权")
    private Integer otherAssetBenchmark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getPcid() {
        return pcid;
    }

    public void setPcid(Long pcid) {
        this.pcid = pcid;
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

    public GeoPoint getLocation() {
        return location;
    }

    public void setLocation(GeoPoint location) {
        this.location = location;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getGdp() {
        return gdp;
    }

    public void setGdp(Integer gdp) {
        this.gdp = gdp;
    }

    public Integer getAvgGdp() {
        return avgGdp;
    }

    public void setAvgGdp(Integer avgGdp) {
        this.avgGdp = avgGdp;
    }

    public Integer getSingleMaleNum() {
        return singleMaleNum;
    }

    public void setSingleMaleNum(Integer singleMaleNum) {
        this.singleMaleNum = singleMaleNum;
    }

    public Integer getSingleFemaleNum() {
        return singleFemaleNum;
    }

    public void setSingleFemaleNum(Integer singleFemaleNum) {
        this.singleFemaleNum = singleFemaleNum;
    }

    public Integer getAvgIncome() {
        return avgIncome;
    }

    public void setAvgIncome(Integer avgIncome) {
        this.avgIncome = avgIncome;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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

    public Integer getCityScore() {
        return cityScore;
    }

    public void setCityScore(Integer cityScore) {
        this.cityScore = cityScore;
    }

    public Integer getCityRank() {
        return cityRank;
    }

    public void setCityRank(Integer cityRank) {
        this.cityRank = cityRank;
    }

    public Integer getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(Integer housePrice) {
        this.housePrice = housePrice;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cid=").append(cid);
        sb.append(", pcid=").append(pcid);
        sb.append(", country=").append(country);
        sb.append(", city=").append(city);
        sb.append(", location=").append(location);
        sb.append(", population=").append(population);
        sb.append(", gdp=").append(gdp);
        sb.append(", avgGdp=").append(avgGdp);
        sb.append(", singleMaleNum=").append(singleMaleNum);
        sb.append(", singleFemaleNum=").append(singleFemaleNum);
        sb.append(", avgIncome=").append(avgIncome);
        sb.append(", level=").append(level);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", cityScore=").append(cityScore);
        sb.append(", cityRank=").append(cityRank);
        sb.append(", housePrice=").append(housePrice);
        sb.append(", houseBenchmark=").append(houseBenchmark);
        sb.append(", salaryBenchmark=").append(salaryBenchmark);
        sb.append(", depositBenchmark=").append(depositBenchmark);
        sb.append(", otherAssetBenchmark=").append(otherAssetBenchmark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}