package com.macro.meedog.server.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;

/**
 * 用户收藏的商品
 * Created by macro on 2018/8/2.
 */
@Data
public class Collection {
    @Id
    private String id;
    @Indexed
    private Long userId;
    private String nickname;
    private String icon;
    @Indexed
    private Long activityId;
    private String activityName;
    private String activityPic;
    private String activitySubTitle;
    private String activityPrice;
    private Date createTime;

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public Long getActivityId() {
        return activityId;
    }
}
