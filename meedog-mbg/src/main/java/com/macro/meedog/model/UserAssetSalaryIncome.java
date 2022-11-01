package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserAssetSalaryIncome implements Serializable {
    @ApiModelProperty(value = "user asset salary 收入")
    private Long id;

    @ApiModelProperty(value = "资产收入ID")
    private Long assetSalaryId;

    @ApiModelProperty(value = "月薪")
    private Integer salary;

    @ApiModelProperty(value = "年终奖")
    private Integer bounus;

    @ApiModelProperty(value = "期权")
    private Integer option;

    @ApiModelProperty(value = "股票")
    private Integer stock;

    @ApiModelProperty(value = "福利")
    private Integer welfare;

    @ApiModelProperty(value = "业余收入包括兼职租金收入")
    private Integer parttimeIncome;

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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getBounus() {
        return bounus;
    }

    public void setBounus(Integer bounus) {
        this.bounus = bounus;
    }

    public Integer getOption() {
        return option;
    }

    public void setOption(Integer option) {
        this.option = option;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getWelfare() {
        return welfare;
    }

    public void setWelfare(Integer welfare) {
        this.welfare = welfare;
    }

    public Integer getParttimeIncome() {
        return parttimeIncome;
    }

    public void setParttimeIncome(Integer parttimeIncome) {
        this.parttimeIncome = parttimeIncome;
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
        sb.append(", salary=").append(salary);
        sb.append(", bounus=").append(bounus);
        sb.append(", option=").append(option);
        sb.append(", stock=").append(stock);
        sb.append(", welfare=").append(welfare);
        sb.append(", parttimeIncome=").append(parttimeIncome);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}