package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserLoverHistory implements Serializable {
    @ApiModelProperty(value = "user 同居恋爱史")
    private Long id;

    @ApiModelProperty(value = "uid")
    private Long uid;

    @ApiModelProperty(value = "对象性别")
    private String loverGender;

    @ApiModelProperty(value = "开始")
    private Date loveRelationStart;

    @ApiModelProperty(value = "结束")
    private Date loveRelationEnd;

    @ApiModelProperty(value = "是否同居 0 否 1 是")
    private Integer livingTogether;

    @ApiModelProperty(value = "分手原因")
    private String breakUpReason;

    @ApiModelProperty(value = "其他补充信息")
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

    public String getLoverGender() {
        return loverGender;
    }

    public void setLoverGender(String loverGender) {
        this.loverGender = loverGender == null ? null : loverGender.trim();
    }

    public Date getLoveRelationStart() {
        return loveRelationStart;
    }

    public void setLoveRelationStart(Date loveRelationStart) {
        this.loveRelationStart = loveRelationStart;
    }

    public Date getLoveRelationEnd() {
        return loveRelationEnd;
    }

    public void setLoveRelationEnd(Date loveRelationEnd) {
        this.loveRelationEnd = loveRelationEnd;
    }

    public Integer getLivingTogether() {
        return livingTogether;
    }

    public void setLivingTogether(Integer livingTogether) {
        this.livingTogether = livingTogether;
    }

    public String getBreakUpReason() {
        return breakUpReason;
    }

    public void setBreakUpReason(String breakUpReason) {
        this.breakUpReason = breakUpReason == null ? null : breakUpReason.trim();
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
        sb.append(", loverGender=").append(loverGender);
        sb.append(", loveRelationStart=").append(loveRelationStart);
        sb.append(", loveRelationEnd=").append(loveRelationEnd);
        sb.append(", livingTogether=").append(livingTogether);
        sb.append(", breakUpReason=").append(breakUpReason);
        sb.append(", description=").append(description);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}