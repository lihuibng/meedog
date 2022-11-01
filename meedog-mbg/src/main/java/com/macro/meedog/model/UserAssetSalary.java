package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserAssetSalary implements Serializable {
    @ApiModelProperty(value = "user asset salary")
    private Long id;

    @ApiModelProperty(value = "用户 id")
    private Long uid;

    @ApiModelProperty(value = "房产")
    private Integer asset;

    @ApiModelProperty(value = "房产描述")
    private String houseDesc;

    @ApiModelProperty(value = "收入 divied / 600w * 100分")
    private Integer salary;

    @ApiModelProperty(value = "储蓄")
    private Integer deposit;

    @ApiModelProperty(value = "其他")
    private Integer other;

    @ApiModelProperty(value = "评估分")
    private Integer score;

    @ApiModelProperty(value = "收入排行")
    private Integer toprank;

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

    public Integer getAsset() {
        return asset;
    }

    public void setAsset(Integer asset) {
        this.asset = asset;
    }

    public String getHouseDesc() {
        return houseDesc;
    }

    public void setHouseDesc(String houseDesc) {
        this.houseDesc = houseDesc == null ? null : houseDesc.trim();
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getOther() {
        return other;
    }

    public void setOther(Integer other) {
        this.other = other;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getToprank() {
        return toprank;
    }

    public void setToprank(Integer toprank) {
        this.toprank = toprank;
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
        sb.append(", asset=").append(asset);
        sb.append(", houseDesc=").append(houseDesc);
        sb.append(", salary=").append(salary);
        sb.append(", deposit=").append(deposit);
        sb.append(", other=").append(other);
        sb.append(", score=").append(score);
        sb.append(", toprank=").append(toprank);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}