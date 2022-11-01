package com.macro.meedog.common.geo;

import com.alibaba.fastjson.annotation.JSONField;
import com.vividsolutions.jts.geom.Coordinate;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author "xxxxxx"
 * @modified 2021/5/16 1:24 下午
 */

public class GeoPoint implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /*
   经度
    */
    private final BigDecimal lng;

    /*
    纬度
     */
    private final BigDecimal lat;

    public GeoPoint(BigDecimal lng, BigDecimal lat) {
        this.lng = lng;
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "lng:" + lng + ";lat:" + lat;
    }

    /**
     * 百度经纬度转换
     */
    @JSONField(serialize = false)
    public Coordinate getCoordinate() {
        //百度坐标系 (BD-09) to WGS84
        double[] wgsPntA = CoordinateUtil.bd09_To_Wgs84(lng.doubleValue(), lat.doubleValue());
        //WGS84->高斯6度分带投影
        double[] gaussPntA = CoordinateUtil.wgs84_To_Gauss6(wgsPntA[0], wgsPntA[1]);
        return new Coordinate(gaussPntA[0], gaussPntA[1]);
    }

}
