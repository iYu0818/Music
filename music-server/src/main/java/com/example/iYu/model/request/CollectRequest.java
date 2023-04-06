package com.example.iYu.model.request;

import lombok.Data;

import java.util.Date;

/**
 * @Author 祝英台炸油条
 * @Time : 2022/6/6 13:11
 **/
@Data
public class CollectRequest {
    private Integer id;

    private Integer userId;

    private Byte type;

    private Integer songId;

    private Integer songListId;

    private Date createTime;

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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "CollectRequest{" +
                "id=" + id +
                ", userId=" + userId +
                ", type=" + type +
                ", songId=" + songId +
                ", songListId=" + songListId +
                ", createTime=" + createTime +
                '}';
    }
}
