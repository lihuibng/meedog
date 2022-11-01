package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserHealth implements Serializable {
    @ApiModelProperty(value = "user  健康")
    private Long id;

    @ApiModelProperty(value = "uid")
    private Long uid;

    @ApiModelProperty(value = "user_family_id")
    private Long userFamilyId;

    @ApiModelProperty(value = "性传染病")
    private String venerealDisease;

    @ApiModelProperty(value = "其他传染病")
    private String infectiousDisease;

    @ApiModelProperty(value = "生育疾病")
    private String maternityDisease;

    @ApiModelProperty(value = "心脑等重病")
    private String acuteDisease;

    @ApiModelProperty(value = "其他")
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

    public Long getUserFamilyId() {
        return userFamilyId;
    }

    public void setUserFamilyId(Long userFamilyId) {
        this.userFamilyId = userFamilyId;
    }

    public String getVenerealDisease() {
        return venerealDisease;
    }

    public void setVenerealDisease(String venerealDisease) {
        this.venerealDisease = venerealDisease == null ? null : venerealDisease.trim();
    }

    public String getInfectiousDisease() {
        return infectiousDisease;
    }

    public void setInfectiousDisease(String infectiousDisease) {
        this.infectiousDisease = infectiousDisease == null ? null : infectiousDisease.trim();
    }

    public String getMaternityDisease() {
        return maternityDisease;
    }

    public void setMaternityDisease(String maternityDisease) {
        this.maternityDisease = maternityDisease == null ? null : maternityDisease.trim();
    }

    public String getAcuteDisease() {
        return acuteDisease;
    }

    public void setAcuteDisease(String acuteDisease) {
        this.acuteDisease = acuteDisease == null ? null : acuteDisease.trim();
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
        sb.append(", userFamilyId=").append(userFamilyId);
        sb.append(", venerealDisease=").append(venerealDisease);
        sb.append(", infectiousDisease=").append(infectiousDisease);
        sb.append(", maternityDisease=").append(maternityDisease);
        sb.append(", acuteDisease=").append(acuteDisease);
        sb.append(", description=").append(description);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}