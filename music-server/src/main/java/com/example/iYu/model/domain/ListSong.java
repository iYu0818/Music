package com.example.iYu.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @Description:歌单歌曲实体
 * @Param:
 * @return:
 * @Author: 程煜
 * @Date: 2023/2/22
 */
@TableName(value = "list_song")
@Data
public class ListSong implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer songId;

    private Integer songListId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
