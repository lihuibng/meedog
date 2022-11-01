package com.macro.meedog.server.domain;

import lombok.Data;

/**
 * @author "xxxxxx"
 * @modified 2021/2/25 7:11 下午
 */
@Data
public class Invitation {
    String email;
    String authCode;

    public Invitation(String invitedEmail, String authCode) {
        this.email = invitedEmail;
        this.authCode = authCode;
    }
}
