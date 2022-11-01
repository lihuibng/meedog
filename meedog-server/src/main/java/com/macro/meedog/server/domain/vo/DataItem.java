package com.macro.meedog.server.domain.vo;

import lombok.Data;

/**
 * @author "xxxxxx"
 * @modified 2021/3/24 11:04 下午
 */

@Data
public class DataItem {
    private String name;
    private int value;
    private boolean checked;


    public DataItem(String k, int i) {
        name = k;
        value = i;
        checked = false;
    }
}
