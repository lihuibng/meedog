package com.macro.meedog.server.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author "xxxxxx"
 * @modified 2021/3/29 9:54 下午
 */
@Data
public class AssetBenchmarkVo {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "城市")
    private String city;
    @ApiModelProperty(value = "区")
    private String district;
    @ApiModelProperty(value = "房产基准线 15年收入")
    private Integer houseBenchmark;
    @ApiModelProperty(value = "收入基准线 40w")
    private Integer salaryBenchmark;
    @ApiModelProperty(value = "储蓄基准线 5年收入")
    private Integer depositBenchmark;
    @ApiModelProperty(value = "其他收入基准线 车1年收入")
    private Integer otherAssetBenchmark;
    @ApiModelProperty(value = "城市平均房价")
    private Integer cityHouseBenchmark;
    @ApiModelProperty(value = "区平均房价")
    private Integer areaHouseBenchmark;
}
