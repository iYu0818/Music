package com.example.iYu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.iYu.common.R;
import com.example.iYu.model.domain.RankList;
import com.example.iYu.model.request.RankListRequest;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: 程煜
 * @Date: 2023/2/26
 */
public interface RankListService extends IService<RankList> {

    R addRank(RankListRequest rankListAddRequest);

    R rankOfSongListId(Long songListId);

    R getUserRank(Long consumerId, Long songListId);

}
