package com.macro.meedog.server.domain.vo;

import com.macro.meedog.model.UserWeibo;
import com.macro.meedog.model.UserWeiboComment;
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
public class WeiboCommentVo {
    @ApiModelProperty(value = "评论ID")
    private String id;

    @ApiModelProperty(value = "用户ID")
    private String uid;

    @ApiModelProperty(value = "用户微信头像")
    private String userNickName;

    @ApiModelProperty(value = "微博ID")
    private String weiboId;

    @ApiModelProperty(value = "评论ID")
    private String commentId;

    @ApiModelProperty(value = "头像")
    private String userIcon;

    @ApiModelProperty(value = "评论内容")
    private String content;

    @ApiModelProperty(value = "喜欢数")
    private Integer likeCount;

    @ApiModelProperty(value = "收藏数")
    private Integer collectCount;

    @ApiModelProperty(value = "阅读数")
    private Integer readCount;

    @ApiModelProperty(value = "转发数")
    private Integer forwardCount;

    @ApiModelProperty(value = "评论数")
    private Integer commentCount;

    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifiedTime;

    private static final long serialVersionUID = 1L;


    static public UserWeiboComment viewToModel(WeiboCommentVo v) {
        UserWeiboComment u = new UserWeiboComment();
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
        if (v.getCommentId() != null) {
            u.setCommentId(Long.parseLong(v.getCommentId()));
        }
        return u;
    }

    static public WeiboCommentVo modelToView(UserWeiboComment u) {
        WeiboCommentVo v = new WeiboCommentVo();
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
        if (u.getCommentId() != null) {
            v.setCommentId(u.getCommentId().toString());
        }
        return v;
    }

    static public List<UserWeiboComment> viewToModel(List<WeiboCommentVo> vList) {
        List<UserWeiboComment> uList = new ArrayList<UserWeiboComment>();
        for (WeiboCommentVo v : vList) {
            uList.add(WeiboCommentVo.viewToModel(v));
        }
        return uList;
    }

    static public List<WeiboCommentVo> modelToView(List<UserWeiboComment> uList) {
        List<WeiboCommentVo> vList = new ArrayList<WeiboCommentVo>();
        for (UserWeiboComment u : uList) {
            vList.add(WeiboCommentVo.modelToView(u));
        }
        return vList;
    }
}
