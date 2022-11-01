package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class FoodTravelConcertSportStoryPicture implements Serializable {
    @ApiModelProperty(value = "饭店、履行、音乐会、运动 故事图片ID")
    private Long id;

    @ApiModelProperty(value = "饭店、履行、音乐会、运动 故事ID")
    private Long foodTravelConcertSportStoryId;

    @ApiModelProperty(value = "图片ID")
    private Long picId;

    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifiedTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFoodTravelConcertSportStoryId() {
        return foodTravelConcertSportStoryId;
    }

    public void setFoodTravelConcertSportStoryId(Long foodTravelConcertSportStoryId) {
        this.foodTravelConcertSportStoryId = foodTravelConcertSportStoryId;
    }

    public Long getPicId() {
        return picId;
    }

    public void setPicId(Long picId) {
        this.picId = picId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", foodTravelConcertSportStoryId=").append(foodTravelConcertSportStoryId);
        sb.append(", picId=").append(picId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}