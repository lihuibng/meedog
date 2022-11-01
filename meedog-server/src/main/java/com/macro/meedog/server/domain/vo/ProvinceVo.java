package com.macro.meedog.server.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/4/12 8:50 下午
 */


@Data
public class ProvinceVo {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "州省")
    private List<DataItem> provinceItems;
}
