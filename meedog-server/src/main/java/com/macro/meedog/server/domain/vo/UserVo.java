package com.macro.meedog.server.domain.vo;

import com.macro.meedog.model.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Description
 * <p>
 * </p>
 * DATE 2020/7/4.
 *
 * @author genglintong.
 */
@Data
public class UserVo {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "用户id")
    private String id;
    @ApiModelProperty(value = "用户唯一id")
    private String uid;
    @ApiModelProperty(value = "用户层级id")
    private String userLevelId;
    @ApiModelProperty(value = "用户基本信息id")
    private String userBasicInfoId;
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

    static public User viewToModel(UserVo v) {
        User u = new User();
        BeanUtils.copyProperties(v, u);
        if (v.getId() != null) {
            u.setId(Long.parseLong(v.getId()));
        }
        if (v.getUid() != null) {
            u.setUid(Long.parseLong(v.getUid()));
        }
        if (v.getUserLevelId() != null) {
            u.setUserLevelId(Long.parseLong(v.getUserLevelId()));
        }
        if (v.getUserBasicInfoId() != null) {
            u.setUserBasicInfoId(Long.parseLong(v.getUserBasicInfoId()));
        }
        return u;
    }

    static public UserVo modelToView(User u) {
        UserVo v = new UserVo();
        BeanUtils.copyProperties(u, v);
        if (u.getId() != null) {
            v.setId(String.valueOf(u.getId()));
        }
        if (u.getUid() != null) {
            v.setUid(String.valueOf(u.getUid()));
        }
        if (u.getUserLevelId() != null) {
            v.setUserLevelId(String.valueOf(u.getUserLevelId()));
        }
        if (u.getUserBasicInfoId() != null) {
            v.setUserBasicInfoId(String.valueOf(u.getUserBasicInfoId()));
        }
        return v;
    }

    static public List<User> viewToModel(List<UserVo> vList) {
        List<User> uList = new ArrayList<User>();
        for (UserVo v : vList) {
            uList.add(UserVo.viewToModel(v));
        }
        return uList;
    }

    static public List<UserVo> modelToView(List<User> uList) {
        List<UserVo> vList = new ArrayList<UserVo>();
        for (User u : uList) {
            vList.add(UserVo.modelToView(u));
        }
        return vList;
    }
}

