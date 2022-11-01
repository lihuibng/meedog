package com.macro.meedog.server.domain;

import lombok.Data;

/**
 * @author "xxxxxx"
 * @modified 2021/4/25 12:32 上午
 */

@Data
public class UserInfo {
    private String nickName;
    private Integer gender;
    private String language;
    private String city;
    private String province;
    private String country;
    private String avatarUrl;
}
