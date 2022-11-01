package com.macro.meedog.search.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/4/29 8:28 下午
 */

@Data
public class SearchParam {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "uid")
    String uid;

    @ApiModelProperty(value = "keyword")
    String keyword;

    @ApiModelProperty(value = "age_low")
    Integer ageLow;

    @ApiModelProperty(value = "age_high")
    Integer ageHigh;

    @ApiModelProperty(value = "height_low")
    Integer heightLow;

    @ApiModelProperty(value = "height_high")
    Integer heightHigh;

    @ApiModelProperty(value = "salary_value")
    Integer salaryValue;

    @ApiModelProperty(value = "college")
    String college;

    @ApiModelProperty(value = "marriages")
    Integer marriages;

    @ApiModelProperty(value = "degrees")
    Integer degrees;

    @ApiModelProperty(value = "districts")
    List<String> districts;

    @ApiModelProperty(value = "households")
    List<String> households;

    @ApiModelProperty(value = "zodiacs")
    List<Integer> zodiacs;

    @ApiModelProperty(value = "constellations")
    List<Integer> constellations;

    @ApiModelProperty(value = "collegeStatus")
    List<Integer> collegeStatus;

}