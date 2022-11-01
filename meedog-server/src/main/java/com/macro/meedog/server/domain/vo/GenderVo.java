package com.macro.meedog.server.domain.vo;

import com.macro.meedog.model.Gender;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author "xxxxxx"
 * @modified 2021/4/13 7:39 下午
 */
@Data
public class GenderVo {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "性别")
    private List<DataItem> genderItems;
}
