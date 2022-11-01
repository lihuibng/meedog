package com.macro.meedog.server.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/3/24 8:20 下午
 */

@Data
public class DegreeVo {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "学位")
    private List<DataItem> degreeItems;
}
