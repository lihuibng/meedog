package com.macro.meedog.activity.domain.vo;

import com.macro.meedog.common.geo.GeoPoint;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author "xxxxxx"
 * @modified 2021/5/16 11:27 上午
 */

public class PlaceVo {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "place ID")
    private Long id;
    @ApiModelProperty(value = "地点名称")
    private String name;
    @ApiModelProperty(value = "评分")
    private BigDecimal score;
    @ApiModelProperty(value = "人均价格")
    private BigDecimal price;
    @ApiModelProperty(value = "省")
    private String province;
    @ApiModelProperty(value = "城市")
    private String city;
    @ApiModelProperty(value = "区")
    private String district;
    @ApiModelProperty(value = "地址")
    private String address;
    @ApiModelProperty(value = "位置的精确度")
    private Integer accuracy;
    @ApiModelProperty(value = "水平精度")
    private Integer horizontalaccuracy;
    @ApiModelProperty(value = "垂直精度")
    private Integer verticalaccuracy;
    @ApiModelProperty(value = "垂直精度")
    private Integer altitude;
    @ApiModelProperty(value = "速度，单位 m/s")
    private Integer speed;
    @ApiModelProperty(value = "地理位置")
    private GeoPoint location;
    private String geohash;
    @ApiModelProperty(value = "电话")
    private String phone;
    @ApiModelProperty(value = "tags")
    private String tags;
    @ApiModelProperty(value = "营业开始时间")
    private Date startTime;
    @ApiModelProperty(value = "营业结束时间")
    private Date endTime;
    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;
    @ApiModelProperty(value = "活动创建时间")
    private Date createTime;
    @ApiModelProperty(value = "活动修改时间")
    private Date modifiedTime;


    public PlaceVo() {
    }
}
