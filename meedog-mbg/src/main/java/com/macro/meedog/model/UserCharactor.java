package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserCharactor implements Serializable {
    @ApiModelProperty(value = "user 性格")
    private Long id;

    @ApiModelProperty(value = "uid")
    private Long uid;

    @ApiModelProperty(value = "内向外向")
    private String inExtroversion;

    @ApiModelProperty(value = "可爱、御女、甜美")
    private String charactorType;

    @ApiModelProperty(value = "tags")
    private String charactorTags;

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

    public String getInExtroversion() {
        return inExtroversion;
    }

    public void setInExtroversion(String inExtroversion) {
        this.inExtroversion = inExtroversion == null ? null : inExtroversion.trim();
    }

    public String getCharactorType() {
        return charactorType;
    }

    public void setCharactorType(String charactorType) {
        this.charactorType = charactorType == null ? null : charactorType.trim();
    }

    public String getCharactorTags() {
        return charactorTags;
    }

    public void setCharactorTags(String charactorTags) {
        this.charactorTags = charactorTags == null ? null : charactorTags.trim();
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
        sb.append(", inExtroversion=").append(inExtroversion);
        sb.append(", charactorType=").append(charactorType);
        sb.append(", charactorTags=").append(charactorTags);
        sb.append(", description=").append(description);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}