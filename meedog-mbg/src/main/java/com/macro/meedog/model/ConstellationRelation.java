package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ConstellationRelation implements Serializable {
    @ApiModelProperty(value = "角色权限管理ID")
    private Long id;

    @ApiModelProperty(value = "星座")
    private Long constellationId;

    @ApiModelProperty(value = "星座2")
    private Long constellationId2;

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

    public Long getConstellationId() {
        return constellationId;
    }

    public void setConstellationId(Long constellationId) {
        this.constellationId = constellationId;
    }

    public Long getConstellationId2() {
        return constellationId2;
    }

    public void setConstellationId2(Long constellationId2) {
        this.constellationId2 = constellationId2;
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
        sb.append(", constellationId=").append(constellationId);
        sb.append(", constellationId2=").append(constellationId2);
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