package com.example.iYu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.iYu.common.R;
import com.example.iYu.model.domain.Collect;
import com.example.iYu.model.request.CollectRequest;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: 程煜
 * @Date: 2023/2/26
 */
public interface CollectService extends IService<Collect> {

    R addCollection(CollectRequest addCollectRequest);

    R existSongId(CollectRequest isCollectRequest);

    R deleteCollect(Integer userId,Integer songId);

    R collectionOfUser(Integer userId);
}
