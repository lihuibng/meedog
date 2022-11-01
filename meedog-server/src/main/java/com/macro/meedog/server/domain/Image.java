package com.macro.meedog.server.domain;

import lombok.Data;

/**
 * @author "xxxxxx"
 * @modified 2021/1/3 4:10 下午
 */

@Data
public class Image {
    Long id;

    byte[] content;

    String name;
}
