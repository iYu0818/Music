package com.example.iYu.controller;

import com.example.iYu.service.ListSongService;
import com.example.iYu.common.R;
import com.example.iYu.model.request.ListSongRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ListSongController {

    @Autowired
    private ListSongService listSongService;


    // 给歌单添加歌曲
    @PostMapping("/listSong/add")
    public R addListSong(@RequestBody ListSongRequest addListSongRequest) {
        return listSongService.addListSong(addListSongRequest);
    }

    // 删除歌单里的歌曲
    @GetMapping("/listSong/delete")
    public R deleteListSong(@RequestParam int songId) {
        return listSongService.deleteListSong(songId);
    }

    // 返回歌单里指定歌单 ID 的歌曲
    @GetMapping("/listSong/detail")
    public R listSongOfSongId(@RequestParam int songListId) {
        return listSongService.listSongOfSongId(songListId);
    }

    // 更新歌单里面的歌曲信息
    @PostMapping("/listSong/update")
    public R updateListSongMsg(@RequestBody ListSongRequest updateListSongRequest) {
        return listSongService.updateListSongMsg(updateListSongRequest);
    }
}
