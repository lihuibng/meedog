package com.macro.meedog.activity.dto;

import com.macro.meedog.activity.validator.FlagValidator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 活动传递参数
 */
@ApiModel(value = "ActivityDto")
public class ActivityDto {
    @ApiModelProperty(value = "活动名称", required = true)
    @NotNull(message = "名称不能为空")
    private String name;
    @ApiModelProperty(value = "活动首字母", required = true)
    @NotNull(message = "首字母不能为空")
    private String firstLetter;
    @ApiModelProperty(value = "排序字段")
    @Min(value = 0, message = "排序最小为0")
    private Integer sort;
    @ApiModelProperty(value = "是否为商家")
    @FlagValidator(value = {"0", "1"}, message = "商家状态不正确")
    private Integer factoryStatus;
    @ApiModelProperty(value = "是否进行显示")
    @FlagValidator(value = {"0", "1"}, message = "显示状态不正确")
    private Integer showStatus;
    @ApiModelProperty(value = "活动首图")
    private String firstPic;
    @ApiModelProperty(value = "活动照片")
    private String bigPic;
    @ApiModelProperty(value = "活动描述")
    private String activityDesc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public void setFirstPic(String firstPic) {
        this.firstPic = firstPic;
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }
}
