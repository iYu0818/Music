package com.example.iYu.model.request;

import lombok.Data;

/**
 * @Author 祝英台炸油条
 * @Time : 2022/6/6 16:57
 **/
@Data
public class RankListRequest {
    private Long id;

    private Long songListId;

    private Long consumerId;

    private Integer score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSongListId() {
        return songListId;
    }

    public void setSongListId(Long songListId) {
        this.songListId = songListId;
    }

    public Long getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "RankListRequest{" +
                "id=" + id +
                ", songListId=" + songListId +
                ", consumerId=" + consumerId +
                ", score=" + score +
                '}';
    }
}
