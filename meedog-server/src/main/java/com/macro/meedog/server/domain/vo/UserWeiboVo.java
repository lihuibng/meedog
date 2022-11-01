package com.macro.meedog.server.domain.vo;

import com.macro.meedog.model.UserWeibo;
import com.macro.meedog.server.domain.WechatInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/4/21 7:16 下午
 */
@Data
public class UserWeiboVo {
    private static final long serialVersionUID = 1L;
    private String id;
    private String uid;
    private String userNickName;
    private String weiboId;
    private String userIcon;
    private Long categoryId;
    private String title;
    @ApiModelProperty(value = "话题内容")
    private String content;
    @ApiModelProperty(value = "喜欢数")
    private Integer likeCount;
    @ApiModelProperty(value = "收藏数")
    private Integer collectCount;
    private Integer readCount;
    private Integer forwardCount;
    private Integer commentCount;
    private List<String> picIds;
    private WechatInfo wechatInfo;
    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    @ApiModelProperty(value = "修改时间")
    private Date modifiedTime;

    static public UserWeibo viewToModel(UserWeiboVo v) {
        UserWeibo u = new UserWeibo();
        BeanUtils.copyProperties(v, u);
        if (v.getId() != null) {
            u.setId(Long.parseLong(v.getId()));
        }
        if (v.getUid() != null) {
            u.setUid(Long.parseLong(v.getUid()));
        }
        if (v.getWeiboId() != null) {
            u.setWeiboId(Long.parseLong(v.getWeiboId()));
        }
        return u;
    }

    static public UserWeiboVo modelToView(UserWeibo u) {
        UserWeiboVo v = new UserWeiboVo();
        BeanUtils.copyProperties(u, v);
        if (u.getId() != null) {
            v.setId(String.valueOf(u.getId()));
        }
        if (u.getUid() != null) {
            v.setUid(String.valueOf(u.getUid()));
        }
        if (u.getWeiboId() != null) {
            v.setWeiboId(u.getWeiboId().toString());
        }
        return v;
    }

    static public List<UserWeibo> viewToModel(List<UserWeiboVo> vList) {
        List<UserWeibo> uList = new ArrayList<UserWeibo>();
        for (UserWeiboVo v : vList) {
            uList.add(UserWeiboVo.viewToModel(v));
        }
        return uList;
    }

    static public List<UserWeiboVo> modelToView(List<UserWeibo> uList) {
        List<UserWeiboVo> vList = new ArrayList<UserWeiboVo>();
        for (UserWeibo u : uList) {
            vList.add(UserWeiboVo.modelToView(u));
        }
        return vList;
    }
}
