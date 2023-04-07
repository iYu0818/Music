package com.example.iYu.model.request;

import lombok.Data;

import java.util.Date;
/**
 * @Description:
 * @Param:
 * @return:
 * @Author: 程煜
 * @Date: 2023/3/17
 */
@Data
public class CommentRequest {
    private Integer id;

    private Integer userId;

    private Integer songId;

    private Integer songListId;

    private String content;

    private Date createTime;

    private Byte nowType;

    private Integer up;//点赞

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public Integer getSongListId() {
        return songListId;
    }

    public void setSongListId(Integer songListId) {
        this.songListId = songListId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getNowType() {
        return nowType;
    }

    public void setNowType(Byte nowType) {
        this.nowType = nowType;
    }

    public Integer getUp() {
        return up;
    }

    public void setUp(Integer up) {
        this.up = up;
    }

    @Override
    public String toString() {
        return "CommentRequest{" +
                "id=" + id +
                ", userId=" + userId +
                ", songId=" + songId +
                ", songListId=" + songListId +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", nowType=" + nowType +
                ", up=" + up +
                '}';
    }
}
