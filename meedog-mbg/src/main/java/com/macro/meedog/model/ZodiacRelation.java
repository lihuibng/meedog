package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ZodiacRelation implements Serializable {
    @ApiModelProperty(value = "角色权限管理ID")
    private Long id;

    @ApiModelProperty(value = "生肖1")
    private Long zodiacId;

    @ApiModelProperty(value = "生肖2")
    private Long zodiacId2;

    @ApiModelProperty(value = "好的")
    private String good;

    @ApiModelProperty(value = "不好的")
    private String bad;

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

    public Long getZodiacId() {
        return zodiacId;
    }

    public void setZodiacId(Long zodiacId) {
        this.zodiacId = zodiacId;
    }

    public Long getZodiacId2() {
        return zodiacId2;
    }

    public void setZodiacId2(Long zodiacId2) {
        this.zodiacId2 = zodiacId2;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good == null ? null : good.trim();
    }

    public String getBad() {
        return bad;
    }

    public void setBad(String bad) {
        this.bad = bad == null ? null : bad.trim();
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
        sb.append(", zodiacId=").append(zodiacId);
        sb.append(", zodiacId2=").append(zodiacId2);
        sb.append(", good=").append(good);
        sb.append(", bad=").append(bad);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}