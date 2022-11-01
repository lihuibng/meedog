package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    @ApiModelProperty(value = "用户id")
    private Long id;

    @ApiModelProperty(value = "用户唯一id")
    private Long uid;

    @ApiModelProperty(value = "用户层级id")
    private Long userLevelId;

    @ApiModelProperty(value = "用户基本信息id")
    private Long userBasicInfoId;

    @ApiModelProperty(value = "用户名称")
    private String username;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "用户昵称")
    private String nickname;

    @ApiModelProperty(value = "用户电话")
    private String phone;

    @ApiModelProperty(value = "用户微信")
    private String wechat;

    @ApiModelProperty(value = "微信openid")
    private String openid;

    @ApiModelProperty(value = "微信session_key")
    private String sessionKey;

    @ApiModelProperty(value = "用户邮件")
    private String email;

    @ApiModelProperty(value = "微信用户名称")
    private String wechatNickname;

    @ApiModelProperty(value = "微信用户性别")
    private Integer wechatGender;

    @ApiModelProperty(value = "微信用户语言")
    private String wechatLanguage;

    @ApiModelProperty(value = "微信用户城市")
    private String wechatCity;

    @ApiModelProperty(value = "微信用户省")
    private String wechatProvince;

    @ApiModelProperty(value = "微信用户国家")
    private String wechatCountry;

    @ApiModelProperty(value = "微信用户图像")
    private String wechatAvatarUrl;

    @ApiModelProperty(value = "微信用户签名")
    private String wechatSignature;

    @ApiModelProperty(value = "微信用户加密data")
    private String wechatEncryptedData;

    @ApiModelProperty(value = "微信用户key")
    private String wechatIv;

    @ApiModelProperty(value = "微信用户cloud id")
    private String wechatCloudid;

    @ApiModelProperty(value = "微信用户原始数据")
    private String wechatRawData;

    @ApiModelProperty(value = "用户头像")
    private String icon;

    @ApiModelProperty(value = "用户来源")
    private Integer sourceType;

    @ApiModelProperty(value = "积分")
    private Integer integration;

    @ApiModelProperty(value = "成长值")
    private Integer growth;

    @ApiModelProperty(value = "剩余抽奖次数")
    private Integer luckyCount;

    @ApiModelProperty(value = "历史积分数量")
    private Integer historyIntegration;

    @ApiModelProperty(value = "个性化签名")
    private String personalizedSignature;

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

    public Long getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(Long userLevelId) {
        this.userLevelId = userLevelId;
    }

    public Long getUserBasicInfoId() {
        return userBasicInfoId;
    }

    public void setUserBasicInfoId(Long userBasicInfoId) {
        this.userBasicInfoId = userBasicInfoId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey == null ? null : sessionKey.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWechatNickname() {
        return wechatNickname;
    }

    public void setWechatNickname(String wechatNickname) {
        this.wechatNickname = wechatNickname == null ? null : wechatNickname.trim();
    }

    public Integer getWechatGender() {
        return wechatGender;
    }

    public void setWechatGender(Integer wechatGender) {
        this.wechatGender = wechatGender;
    }

    public String getWechatLanguage() {
        return wechatLanguage;
    }

    public void setWechatLanguage(String wechatLanguage) {
        this.wechatLanguage = wechatLanguage == null ? null : wechatLanguage.trim();
    }

    public String getWechatCity() {
        return wechatCity;
    }

    public void setWechatCity(String wechatCity) {
        this.wechatCity = wechatCity == null ? null : wechatCity.trim();
    }

    public String getWechatProvince() {
        return wechatProvince;
    }

    public void setWechatProvince(String wechatProvince) {
        this.wechatProvince = wechatProvince == null ? null : wechatProvince.trim();
    }

    public String getWechatCountry() {
        return wechatCountry;
    }

    public void setWechatCountry(String wechatCountry) {
        this.wechatCountry = wechatCountry == null ? null : wechatCountry.trim();
    }

    public String getWechatAvatarUrl() {
        return wechatAvatarUrl;
    }

    public void setWechatAvatarUrl(String wechatAvatarUrl) {
        this.wechatAvatarUrl = wechatAvatarUrl == null ? null : wechatAvatarUrl.trim();
    }

    public String getWechatSignature() {
        return wechatSignature;
    }

    public void setWechatSignature(String wechatSignature) {
        this.wechatSignature = wechatSignature == null ? null : wechatSignature.trim();
    }

    public String getWechatEncryptedData() {
        return wechatEncryptedData;
    }

    public void setWechatEncryptedData(String wechatEncryptedData) {
        this.wechatEncryptedData = wechatEncryptedData == null ? null : wechatEncryptedData.trim();
    }

    public String getWechatIv() {
        return wechatIv;
    }

    public void setWechatIv(String wechatIv) {
        this.wechatIv = wechatIv == null ? null : wechatIv.trim();
    }

    public String getWechatCloudid() {
        return wechatCloudid;
    }

    public void setWechatCloudid(String wechatCloudid) {
        this.wechatCloudid = wechatCloudid == null ? null : wechatCloudid.trim();
    }

    public String getWechatRawData() {
        return wechatRawData;
    }

    public void setWechatRawData(String wechatRawData) {
        this.wechatRawData = wechatRawData == null ? null : wechatRawData.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getLuckyCount() {
        return luckyCount;
    }

    public void setLuckyCount(Integer luckyCount) {
        this.luckyCount = luckyCount;
    }

    public Integer getHistoryIntegration() {
        return historyIntegration;
    }

    public void setHistoryIntegration(Integer historyIntegration) {
        this.historyIntegration = historyIntegration;
    }

    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature == null ? null : personalizedSignature.trim();
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
        sb.append(", userLevelId=").append(userLevelId);
        sb.append(", userBasicInfoId=").append(userBasicInfoId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", phone=").append(phone);
        sb.append(", wechat=").append(wechat);
        sb.append(", openid=").append(openid);
        sb.append(", sessionKey=").append(sessionKey);
        sb.append(", email=").append(email);
        sb.append(", wechatNickname=").append(wechatNickname);
        sb.append(", wechatGender=").append(wechatGender);
        sb.append(", wechatLanguage=").append(wechatLanguage);
        sb.append(", wechatCity=").append(wechatCity);
        sb.append(", wechatProvince=").append(wechatProvince);
        sb.append(", wechatCountry=").append(wechatCountry);
        sb.append(", wechatAvatarUrl=").append(wechatAvatarUrl);
        sb.append(", wechatSignature=").append(wechatSignature);
        sb.append(", wechatEncryptedData=").append(wechatEncryptedData);
        sb.append(", wechatIv=").append(wechatIv);
        sb.append(", wechatCloudid=").append(wechatCloudid);
        sb.append(", wechatRawData=").append(wechatRawData);
        sb.append(", icon=").append(icon);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", integration=").append(integration);
        sb.append(", growth=").append(growth);
        sb.append(", luckyCount=").append(luckyCount);
        sb.append(", historyIntegration=").append(historyIntegration);
        sb.append(", personalizedSignature=").append(personalizedSignature);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}