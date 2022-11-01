package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class LoveConfirm implements Serializable {
    @ApiModelProperty(value = "user 恋爱确认书")
    private Long id;

    @ApiModelProperty(value = "user id")
    private Long uid;

    @ApiModelProperty(value = "lover user id")
    private Long loverUid;

    @ApiModelProperty(value = "陈述")
    private String confirm;

    @ApiModelProperty(value = "约束生效时间")
    private Date start;

    @ApiModelProperty(value = "约束结束时间")
    private Date end;

    @ApiModelProperty(value = "打印拍照图片地址")
    private String image;

    @ApiModelProperty(value = "另一半打印拍照图片地址")
    private String loverImage;

    @ApiModelProperty(value = "恋爱状态: 0:单身不想找 1:单身3月内 2:单身半年 3:单身1年内 4:单身2年内 5:单身3年内 6:有固定若干个目标 7:有固定的心仪对象,待表白 8:恋爱中非结婚对象 9:恋爱中结婚对象 10:恋爱中有备胎 11:恋爱中待订婚 12:恋爱中订婚中 13:恋爱中已经订婚 14:恋爱中筹备结婚 15:结婚 16:结婚离异")
    private Integer loveStatus;

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

    public Long getLoverUid() {
        return loverUid;
    }

    public void setLoverUid(Long loverUid) {
        this.loverUid = loverUid;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm == null ? null : confirm.trim();
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getLoverImage() {
        return loverImage;
    }

    public void setLoverImage(String loverImage) {
        this.loverImage = loverImage == null ? null : loverImage.trim();
    }

    public Integer getLoveStatus() {
        return loveStatus;
    }

    public void setLoveStatus(Integer loveStatus) {
        this.loveStatus = loveStatus;
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
        sb.append(", loverUid=").append(loverUid);
        sb.append(", confirm=").append(confirm);
        sb.append(", start=").append(start);
        sb.append(", end=").append(end);
        sb.append(", image=").append(image);
        sb.append(", loverImage=").append(loverImage);
        sb.append(", loveStatus=").append(loveStatus);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}