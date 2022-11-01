package com.macro.meedog.server.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * 用户商品浏览历史记录
 * Created by macro on 2018/8/3.
 */
@Document
@Data
public class ReadHistory {
    @Id
    private Long id;
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

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
