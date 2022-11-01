package com.macro.meedog.server.domain;

import io.swagger.models.auth.In;
import lombok.Data;

/**
 * @author "xxxxxx"
 * @modified 2021/4/25 12:13 上午
 */
@Data
public class WechatInfo {
    private String rawData;
    private String signature;
    private String encryptedData;
    private String iv;
    private String cloudID;
    private UserInfo userInfo;


}