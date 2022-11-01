package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserAccount implements Serializable {
    @ApiModelProperty(value = "user 身份")
    private Long id;

    @ApiModelProperty(value = "uid")
    private Long uid;

    @ApiModelProperty(value = "微信主号")
    private String wechatMajor;

    @ApiModelProperty(value = "微信次号")
    private String wechatMinor;

    @ApiModelProperty(value = "微信小号")
    private String wechatMini;

    @ApiModelProperty(value = "QQ")
    private String qqId;

    @ApiModelProperty(value = "Douban")
    private String doubanId;

    @ApiModelProperty(value = "Zhihu")
    private String zhihuId;

    @ApiModelProperty(value = "Weibo")
    private String weiboId;

    @ApiModelProperty(value = "Douyin")
    private String douyinId;

    @ApiModelProperty(value = "Kuai Shou")
    private String kuaishouId;

    @ApiModelProperty(value = "Bilibili")
    private String bilibiliId;

    @ApiModelProperty(value = "Tik Tok")
    private String tiktokId;

    @ApiModelProperty(value = "Youtube")
    private String youtubeId;

    @ApiModelProperty(value = "Facebook")
    private String facebookId;

    @ApiModelProperty(value = "Instgram")
    private String instgramId;

    @ApiModelProperty(value = "Twitter")
    private String twitterId;

    @ApiModelProperty(value = "Maimia")
    private String maimaiId;

    @ApiModelProperty(value = "Linkedin")
    private String linkedinId;

    @ApiModelProperty(value = "电话主号")
    private String phoneMajor;

    @ApiModelProperty(value = "电话次号")
    private String phoneMinor;

    @ApiModelProperty(value = "电话小号")
    private String phoneMini;

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

    public String getWechatMajor() {
        return wechatMajor;
    }

    public void setWechatMajor(String wechatMajor) {
        this.wechatMajor = wechatMajor == null ? null : wechatMajor.trim();
    }

    public String getWechatMinor() {
        return wechatMinor;
    }

    public void setWechatMinor(String wechatMinor) {
        this.wechatMinor = wechatMinor == null ? null : wechatMinor.trim();
    }

    public String getWechatMini() {
        return wechatMini;
    }

    public void setWechatMini(String wechatMini) {
        this.wechatMini = wechatMini == null ? null : wechatMini.trim();
    }

    public String getQqId() {
        return qqId;
    }

    public void setQqId(String qqId) {
        this.qqId = qqId == null ? null : qqId.trim();
    }

    public String getDoubanId() {
        return doubanId;
    }

    public void setDoubanId(String doubanId) {
        this.doubanId = doubanId == null ? null : doubanId.trim();
    }

    public String getZhihuId() {
        return zhihuId;
    }

    public void setZhihuId(String zhihuId) {
        this.zhihuId = zhihuId == null ? null : zhihuId.trim();
    }

    public String getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(String weiboId) {
        this.weiboId = weiboId == null ? null : weiboId.trim();
    }

    public String getDouyinId() {
        return douyinId;
    }

    public void setDouyinId(String douyinId) {
        this.douyinId = douyinId == null ? null : douyinId.trim();
    }

    public String getKuaishouId() {
        return kuaishouId;
    }

    public void setKuaishouId(String kuaishouId) {
        this.kuaishouId = kuaishouId == null ? null : kuaishouId.trim();
    }

    public String getBilibiliId() {
        return bilibiliId;
    }

    public void setBilibiliId(String bilibiliId) {
        this.bilibiliId = bilibiliId == null ? null : bilibiliId.trim();
    }

    public String getTiktokId() {
        return tiktokId;
    }

    public void setTiktokId(String tiktokId) {
        this.tiktokId = tiktokId == null ? null : tiktokId.trim();
    }

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId == null ? null : youtubeId.trim();
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId == null ? null : facebookId.trim();
    }

    public String getInstgramId() {
        return instgramId;
    }

    public void setInstgramId(String instgramId) {
        this.instgramId = instgramId == null ? null : instgramId.trim();
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId == null ? null : twitterId.trim();
    }

    public String getMaimaiId() {
        return maimaiId;
    }

    public void setMaimaiId(String maimaiId) {
        this.maimaiId = maimaiId == null ? null : maimaiId.trim();
    }

    public String getLinkedinId() {
        return linkedinId;
    }

    public void setLinkedinId(String linkedinId) {
        this.linkedinId = linkedinId == null ? null : linkedinId.trim();
    }

    public String getPhoneMajor() {
        return phoneMajor;
    }

    public void setPhoneMajor(String phoneMajor) {
        this.phoneMajor = phoneMajor == null ? null : phoneMajor.trim();
    }

    public String getPhoneMinor() {
        return phoneMinor;
    }

    public void setPhoneMinor(String phoneMinor) {
        this.phoneMinor = phoneMinor == null ? null : phoneMinor.trim();
    }

    public String getPhoneMini() {
        return phoneMini;
    }

    public void setPhoneMini(String phoneMini) {
        this.phoneMini = phoneMini == null ? null : phoneMini.trim();
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
        sb.append(", wechatMajor=").append(wechatMajor);
        sb.append(", wechatMinor=").append(wechatMinor);
        sb.append(", wechatMini=").append(wechatMini);
        sb.append(", qqId=").append(qqId);
        sb.append(", doubanId=").append(doubanId);
        sb.append(", zhihuId=").append(zhihuId);
        sb.append(", weiboId=").append(weiboId);
        sb.append(", douyinId=").append(douyinId);
        sb.append(", kuaishouId=").append(kuaishouId);
        sb.append(", bilibiliId=").append(bilibiliId);
        sb.append(", tiktokId=").append(tiktokId);
        sb.append(", youtubeId=").append(youtubeId);
        sb.append(", facebookId=").append(facebookId);
        sb.append(", instgramId=").append(instgramId);
        sb.append(", twitterId=").append(twitterId);
        sb.append(", maimaiId=").append(maimaiId);
        sb.append(", linkedinId=").append(linkedinId);
        sb.append(", phoneMajor=").append(phoneMajor);
        sb.append(", phoneMinor=").append(phoneMinor);
        sb.append(", phoneMini=").append(phoneMini);
        sb.append(", description=").append(description);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}