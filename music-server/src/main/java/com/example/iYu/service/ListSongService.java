package com.example.iYu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.iYu.common.R;
import com.example.iYu.model.domain.ListSong;
import com.example.iYu.model.request.ListSongRequest;

import java.util.List;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: 程煜
 * @Date: 2023/2/26
 */
public interface ListSongService extends IService<ListSong> {

    R addListSong(ListSongRequest addListSongRequest);

    R updateListSongMsg(ListSongRequest updateListSongRequest);

    R deleteListSong(Integer songId);

    //看看这啥
    List<ListSong> allListSong();

    R listSongOfSongId(Integer songListId);
}
