package com.macro.meedog.server.domain;

import lombok.Data;

/**
 * Description
 * <p>
 * </p>
 * DATE 2020/7/4.
 *
 * @author .
 */
@Data
public class LoginResult {
    private long uid;
    private String token;

    public LoginResult(long u, String t) {
        uid = u;
        token = t;
    }
}

