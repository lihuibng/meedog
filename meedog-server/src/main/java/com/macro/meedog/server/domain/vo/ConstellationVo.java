package com.macro.meedog.server.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/4/12 8:38 下午
 */


@Data
public class ConstellationVo {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "生肖")
    private List<DataItem> constellationItems;
}
