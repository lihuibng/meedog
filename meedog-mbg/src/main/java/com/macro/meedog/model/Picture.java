package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Picture implements Serializable {
    @ApiModelProperty(value = "活动ID")
    private Long id;

    @ApiModelProperty(value = "图片名称")
    private String name;

    @ApiModelProperty(value = "图片高")
    private Integer height;

    @ApiModelProperty(value = "图片宽")
    private Integer width;

    @ApiModelProperty(value = "size")
    private Integer size;

    @ApiModelProperty(value = "图片格式 png、jpg")
    private Integer fileType;

    @ApiModelProperty(value = "图片unique id")
    private Long picId;

    @ApiModelProperty(value = "图片描述")
    private String picDesc;

    @ApiModelProperty(value = "图片标签")
    private String picTags;

    @ApiModelProperty(value = "图片unique id")
    private String picMd5;

    @ApiModelProperty(value = "图片局部敏感hash id")
    private String picLshId;

    @ApiModelProperty(value = "缩略图")
    private String thumbPic;

    @ApiModelProperty(value = "原始图")
    private String origPic;

    @ApiModelProperty(value = "小尺寸图")
    private String smallPic;

    @ApiModelProperty(value = "大尺寸图")
    private String largePic;

    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;

    @ApiModelProperty(value = "图片创建时间")
    private Date createTime;

    @ApiModelProperty(value = "图片修改时间")
    private Date modifiedTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public Long getPicId() {
        return picId;
    }

    public void setPicId(Long picId) {
        this.picId = picId;
    }

    public String getPicDesc() {
        return picDesc;
    }

    public void setPicDesc(String picDesc) {
        this.picDesc = picDesc == null ? null : picDesc.trim();
    }

    public String getPicTags() {
        return picTags;
    }

    public void setPicTags(String picTags) {
        this.picTags = picTags == null ? null : picTags.trim();
    }

    public String getPicMd5() {
        return picMd5;
    }

    public void setPicMd5(String picMd5) {
        this.picMd5 = picMd5 == null ? null : picMd5.trim();
    }

    public String getPicLshId() {
        return picLshId;
    }

    public void setPicLshId(String picLshId) {
        this.picLshId = picLshId == null ? null : picLshId.trim();
    }

    public String getThumbPic() {
        return thumbPic;
    }

    public void setThumbPic(String thumbPic) {
        this.thumbPic = thumbPic == null ? null : thumbPic.trim();
    }

    public String getOrigPic() {
        return origPic;
    }

    public void setOrigPic(String origPic) {
        this.origPic = origPic == null ? null : origPic.trim();
    }

    public String getSmallPic() {
        return smallPic;
    }

    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic == null ? null : smallPic.trim();
    }

    public String getLargePic() {
        return largePic;
    }

    public void setLargePic(String largePic) {
        this.largePic = largePic == null ? null : largePic.trim();
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
        sb.append(", name=").append(name);
        sb.append(", height=").append(height);
        sb.append(", width=").append(width);
        sb.append(", size=").append(size);
        sb.append(", fileType=").append(fileType);
        sb.append(", picId=").append(picId);
        sb.append(", picDesc=").append(picDesc);
        sb.append(", picTags=").append(picTags);
        sb.append(", picMd5=").append(picMd5);
        sb.append(", picLshId=").append(picLshId);
        sb.append(", thumbPic=").append(thumbPic);
        sb.append(", origPic=").append(origPic);
        sb.append(", smallPic=").append(smallPic);
        sb.append(", largePic=").append(largePic);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}