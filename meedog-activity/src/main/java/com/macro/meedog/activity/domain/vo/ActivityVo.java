package com.macro.meedog.activity.domain.vo;

import com.macro.meedog.model.Activity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/5/16 10:44 上午
 */
@Data
public class ActivityVo {
    @ApiModelProperty(value = "活动ID")
    private String id;

    @ApiModelProperty(value = "地址ID")
    private String placeId;

    @ApiModelProperty(value = "user similar id")
    private String usid;

    @ApiModelProperty(value = "用户ID")
    private String uid;

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


    static public Activity viewToModel(ActivityVo v) {
        Activity u = new Activity();
        BeanUtils.copyProperties(v, u);
        if (v.getId() != null) {
            u.setId(Long.parseLong(v.getId()));
        }
        if (v.getUid() != null) {
            u.setUid(Long.parseLong(v.getUid()));
        }
        if (v.getPlaceId() != null) {
            u.setPlaceId(Long.parseLong(v.getPlaceId()));
        }
        if (v.getUsid() != null) {
            u.setUsid(Long.parseLong(v.getUsid()));
        }
        return u;
    }

    static public ActivityVo modelToView(Activity u) {
        ActivityVo v = new ActivityVo();
        BeanUtils.copyProperties(u, v);
        if (u.getId() != null) {
            v.setId(String.valueOf(u.getId()));
        }
        if (u.getUid() != null) {
            v.setUid(String.valueOf(u.getUid()));
        }
        if (u.getPlaceId() != null) {
            v.setPlaceId(String.valueOf(u.getPlaceId()));
        }
        if (u.getUsid() != null) {
            v.setUsid(String.valueOf(u.getUsid()));
        }
        return v;
    }

    static public List<Activity> viewToModel(List<ActivityVo> vList) {
        List<Activity> uList = new ArrayList<Activity>();
        for (ActivityVo v : vList) {
            uList.add(ActivityVo.viewToModel(v));
        }
        return uList;
    }

    static public List<ActivityVo> modelToView(List<Activity> uList) {
        List<ActivityVo> vList = new ArrayList<ActivityVo>();
        for (Activity u : uList) {
            vList.add(ActivityVo.modelToView(u));
        }
        return vList;
    }
}
