package com.example.iYu.controller;

import com.example.iYu.common.R;
import com.example.iYu.model.request.RankListRequest;
import com.example.iYu.service.RankListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
* @Description: 评分controller
* @Param:
* @return:
* @Author: 程煜
* @Date: 2023/4/5
*/
@RestController
public class RankListController {

    @Autowired
    private RankListService rankListService;


    // 提交评分
    @PostMapping("/rankList/add")
    public R addRank(@RequestBody RankListRequest rankListAddRequest) {
        return rankListService.addRank(rankListAddRequest);
    }

    // 获取指定歌单的评分
    @GetMapping("/rankList")
    public R rankOfSongListId(@RequestParam Long songListId) {
        return rankListService.rankOfSongListId(songListId);
    }

    // 获取指定用户的歌单评分
    @GetMapping("/rankList/user")
    public R getUserRank(@RequestParam Long consumerId, @RequestParam Long songListId) {
        return rankListService.getUserRank(consumerId, songListId);
    }
}
