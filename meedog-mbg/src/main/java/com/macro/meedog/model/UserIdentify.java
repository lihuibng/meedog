package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserIdentify implements Serializable {
    @ApiModelProperty(value = "user 身份")
    private Long id;

    @ApiModelProperty(value = "uid")
    private Long uid;

    @ApiModelProperty(value = "名字没有姓氏")
    private String name;

    @ApiModelProperty(value = "姓氏")
    private String familyName;

    @ApiModelProperty(value = "护照")
    private String passport;

    @ApiModelProperty(value = "身份证前14位")
    private String idNumber;

    @ApiModelProperty(value = "微信支付分")
    private Integer wechatCredit;

    @ApiModelProperty(value = "芝麻信用")
    private Integer sesameCredit;

    @ApiModelProperty(value = "个税截图地址")
    private String individualIncomeTax;

    @ApiModelProperty(value = "支付宝截图地址")
    private String alipaySocialSecurity;

    @ApiModelProperty(value = "学位证书地址")
    private String degreeDiploma;

    @ApiModelProperty(value = "工作单位")
    private String job;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport == null ? null : passport.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public Integer getWechatCredit() {
        return wechatCredit;
    }

    public void setWechatCredit(Integer wechatCredit) {
        this.wechatCredit = wechatCredit;
    }

    public Integer getSesameCredit() {
        return sesameCredit;
    }

    public void setSesameCredit(Integer sesameCredit) {
        this.sesameCredit = sesameCredit;
    }

    public String getIndividualIncomeTax() {
        return individualIncomeTax;
    }

    public void setIndividualIncomeTax(String individualIncomeTax) {
        this.individualIncomeTax = individualIncomeTax == null ? null : individualIncomeTax.trim();
    }

    public String getAlipaySocialSecurity() {
        return alipaySocialSecurity;
    }

    public void setAlipaySocialSecurity(String alipaySocialSecurity) {
        this.alipaySocialSecurity = alipaySocialSecurity == null ? null : alipaySocialSecurity.trim();
    }

    public String getDegreeDiploma() {
        return degreeDiploma;
    }

    public void setDegreeDiploma(String degreeDiploma) {
        this.degreeDiploma = degreeDiploma == null ? null : degreeDiploma.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
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
        sb.append(", name=").append(name);
        sb.append(", familyName=").append(familyName);
        sb.append(", passport=").append(passport);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", wechatCredit=").append(wechatCredit);
        sb.append(", sesameCredit=").append(sesameCredit);
        sb.append(", individualIncomeTax=").append(individualIncomeTax);
        sb.append(", alipaySocialSecurity=").append(alipaySocialSecurity);
        sb.append(", degreeDiploma=").append(degreeDiploma);
        sb.append(", job=").append(job);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}