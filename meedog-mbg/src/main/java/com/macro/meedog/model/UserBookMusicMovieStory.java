package com.macro.meedog.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserBookMusicMovieStory implements Serializable {
    @ApiModelProperty(value = "user book music movie story")
    private Long id;

    @ApiModelProperty(value = "book music movie id")
    private Long bookMusicMovieId;

    @ApiModelProperty(value = "记忆深刻")
    private String memoried;

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

    public Long getBookMusicMovieId() {
        return bookMusicMovieId;
    }

    public void setBookMusicMovieId(Long bookMusicMovieId) {
        this.bookMusicMovieId = bookMusicMovieId;
    }

    public String getMemoried() {
        return memoried;
    }

    public void setMemoried(String memoried) {
        this.memoried = memoried == null ? null : memoried.trim();
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
        sb.append(", bookMusicMovieId=").append(bookMusicMovieId);
        sb.append(", memoried=").append(memoried);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}