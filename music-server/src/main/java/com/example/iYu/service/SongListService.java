package com.example.iYu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.iYu.common.R;
import com.example.iYu.model.domain.SongList;
import com.example.iYu.model.request.SongListRequest;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: 程煜
 * @Date: 2023/2/26
 */
public interface SongListService extends IService<SongList> {

    R addSongList(SongListRequest addSongListRequest);

    R updateSongListMsg(SongListRequest updateSongListRequest);

    R updateSongListImg(MultipartFile avatorFile, int id);

    R deleteSongList(Integer id);

    R allSongList();

    R likeTitle(String title);

    R likeStyle(String style);
}
