package com.macro.meedog.server.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/4/13 7:39 下午
 */
@Data
public class SexualTypeVo {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "性取向")
    private List<DataItem> SexualTypeItems;
}
