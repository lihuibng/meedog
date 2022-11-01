package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Activity implements Serializable {
    @ApiModelProperty(value = "活动ID")
    private Long id;

    @ApiModelProperty(value = "地址ID")
    private Long placeId;

    @ApiModelProperty(value = "user similar id")
    private Long usid;

    @ApiModelProperty(value = "用户ID")
    private Long uid;

    @ApiModelProperty(value = "用户微信头像")
    private String userNickName;

    @ApiModelProperty(value = "头像")
    private String userIcon;

    @ApiModelProperty(value = "支付宝二维码")
    private String alipayQr;

    @ApiModelProperty(value = "微信支付二维码")
    private String wepayQr;

    @ApiModelProperty(value = "微信公众号链接")
    private String wechatOfficalLink;

    @ApiModelProperty(value = "微信群二维码")
    private String wechatGroupQr;

    @ApiModelProperty(value = "活动名称")
    private String name;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "组织者 昵称")
    private String organizerName;

    @ApiModelProperty(value = "组织者 微信")
    private String organizerWechat;

    @ApiModelProperty(value = "组织者 电话")
    private String organizerPhone;

    @ApiModelProperty(value = "活动类别：0 私人组织活动 1 商家营销活动 2 线上直播活动")
    private Integer factoryStatus;

    @ApiModelProperty(value = "活动描述")
    private String activityDesc;

    @ApiModelProperty(value = "限制人数")
    private Integer participantLimit;

    @ApiModelProperty(value = "活动开始时间")
    private Date start;

    @ApiModelProperty(value = "活动结束时间")
    private Date end;

    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;

    @ApiModelProperty(value = "活动创建时间")
    private Date createTime;

    @ApiModelProperty(value = "活动修改时间")
    private Date modifiedTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    public Long getUsid() {
        return usid;
    }

    public void setUsid(Long usid) {
        this.usid = usid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName == null ? null : userNickName.trim();
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon == null ? null : userIcon.trim();
    }

    public String getAlipayQr() {
        return alipayQr;
    }

    public void setAlipayQr(String alipayQr) {
        this.alipayQr = alipayQr == null ? null : alipayQr.trim();
    }

    public String getWepayQr() {
        return wepayQr;
    }

    public void setWepayQr(String wepayQr) {
        this.wepayQr = wepayQr == null ? null : wepayQr.trim();
    }

    public String getWechatOfficalLink() {
        return wechatOfficalLink;
    }

    public void setWechatOfficalLink(String wechatOfficalLink) {
        this.wechatOfficalLink = wechatOfficalLink == null ? null : wechatOfficalLink.trim();
    }

    public String getWechatGroupQr() {
        return wechatGroupQr;
    }

    public void setWechatGroupQr(String wechatGroupQr) {
        this.wechatGroupQr = wechatGroupQr == null ? null : wechatGroupQr.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName == null ? null : organizerName.trim();
    }

    public String getOrganizerWechat() {
        return organizerWechat;
    }

    public void setOrganizerWechat(String organizerWechat) {
        this.organizerWechat = organizerWechat == null ? null : organizerWechat.trim();
    }

    public String getOrganizerPhone() {
        return organizerPhone;
    }

    public void setOrganizerPhone(String organizerPhone) {
        this.organizerPhone = organizerPhone == null ? null : organizerPhone.trim();
    }

    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc == null ? null : activityDesc.trim();
    }

    public Integer getParticipantLimit() {
        return participantLimit;
    }

    public void setParticipantLimit(Integer participantLimit) {
        this.participantLimit = participantLimit;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
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
        sb.append(", placeId=").append(placeId);
        sb.append(", usid=").append(usid);
        sb.append(", uid=").append(uid);
        sb.append(", userNickName=").append(userNickName);
        sb.append(", userIcon=").append(userIcon);
        sb.append(", alipayQr=").append(alipayQr);
        sb.append(", wepayQr=").append(wepayQr);
        sb.append(", wechatOfficalLink=").append(wechatOfficalLink);
        sb.append(", wechatGroupQr=").append(wechatGroupQr);
        sb.append(", name=").append(name);
        sb.append(", address=").append(address);
        sb.append(", organizerName=").append(organizerName);
        sb.append(", organizerWechat=").append(organizerWechat);
        sb.append(", organizerPhone=").append(organizerPhone);
        sb.append(", factoryStatus=").append(factoryStatus);
        sb.append(", activityDesc=").append(activityDesc);
        sb.append(", participantLimit=").append(participantLimit);
        sb.append(", start=").append(start);
        sb.append(", end=").append(end);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}