package com.example.iYu.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

/**
 * @Description:评论实体
 * @Param:
 * @return:
 * @Author: 程煜
 * @Date: 2023/2/22
 */
@TableName(value = "comment")
@Data
public class Comment {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private Integer songId;

    private Integer songListId;

    private String content;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private Byte type;

    private Integer up;


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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getUp() {
        return up;
    }

    public void setUp(Integer up) {
        this.up = up;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
