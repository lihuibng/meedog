package com.macro.meedog.server.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * 会员关注的品牌
 * Created by macro on 2018/8/2.
 */

@Data
@Document
public class Attention {
    @Id
    private String id;

    private Long userId;
    private String nickname;
    private String icon;

    private Long activityId;
    private String activityName;
    private String activityPic;
    private String activityCity;
    private Date createTime;
    private Date modifiedTime;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getActivityId() {
        return activityId;
    }
}
