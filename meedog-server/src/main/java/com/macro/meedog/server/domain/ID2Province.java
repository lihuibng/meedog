package com.macro.meedog.server.domain;

import lombok.Data;

/**
 * @author "xxxxxx"
 * @modified 2021/4/13 7:15 下午
 */

@Data
public class ID2Province {
    String province;
    String city;
    String country;
    String id;

    public ID2Province(String i, String p, String c) {
        id = i;
        province = p;
        city = c;
        country = "中国";
    }

}
