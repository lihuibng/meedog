package com.macro.meedog.server.domain;

import lombok.Data;

/**
 * @author "xxxxxx"
 * @modified 2021/2/23 10:57 下午
 */

@Data
public class RegisterInfo {
    private String username;
    private String email;
    private String authCode;
    private String password;
    private String realname;
    private String realBirthday;
    private String idCardBirthday;
    private String idCard6th;
}
