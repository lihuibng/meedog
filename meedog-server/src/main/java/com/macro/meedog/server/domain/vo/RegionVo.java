package com.macro.meedog.server.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/3/28 11:22 上午
 */

@Data
public class RegionVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "州省")
    private List<MapDataItem> regionItems;
}
