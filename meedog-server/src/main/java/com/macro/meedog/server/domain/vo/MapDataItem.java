package com.macro.meedog.server.domain.vo;

import lombok.Data;

import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/4/13 12:12 下午
 */
@Data
public class MapDataItem {

    private String name;
    private int value;
    private boolean checked;
    List<DataItem> children;

    public MapDataItem(String k, int v, List<DataItem> c) {
        name = k;
        value = v;
        checked = false;
        children = c;
    }
}
