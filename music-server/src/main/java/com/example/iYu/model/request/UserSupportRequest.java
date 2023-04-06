package com.example.iYu.model.request;

import lombok.Data;

/**
 * @Author 祝英台炸油条
 * @Time : 2022/6/11 16:08
 **/
@Data
public class UserSupportRequest {
    Integer id;
    Integer commentId;
    Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
