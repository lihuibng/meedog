package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserSimilar implements Serializable {
    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "simlilar id ")
    private Long simId;

    @ApiModelProperty(value = "uid ID")
    private Long uid;

    @ApiModelProperty(value = "基本分数")
    private Integer basicScore;

    @ApiModelProperty(value = "学历分数")
    private Integer educationScore;

    @ApiModelProperty(value = "财富分数")
    private Integer wealthScore;

    @ApiModelProperty(value = "tags")
    private String tags;

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

    public Long getSimId() {
        return simId;
    }

    public void setSimId(Long simId) {
        this.simId = simId;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getBasicScore() {
        return basicScore;
    }

    public void setBasicScore(Integer basicScore) {
        this.basicScore = basicScore;
    }

    public Integer getEducationScore() {
        return educationScore;
    }

    public void setEducationScore(Integer educationScore) {
        this.educationScore = educationScore;
    }

    public Integer getWealthScore() {
        return wealthScore;
    }

    public void setWealthScore(Integer wealthScore) {
        this.wealthScore = wealthScore;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
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
        sb.append(", simId=").append(simId);
        sb.append(", uid=").append(uid);
        sb.append(", basicScore=").append(basicScore);
        sb.append(", educationScore=").append(educationScore);
        sb.append(", wealthScore=").append(wealthScore);
        sb.append(", tags=").append(tags);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}