package com.example.iYu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.iYu.common.R;
import com.example.iYu.mapper.RankListMapper;
import com.example.iYu.service.RankListService;
import com.example.iYu.model.domain.RankList;
import com.example.iYu.model.request.RankListRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @Description:
 * @Param:
 * @return:
 * @Author: 程煜
 * @Date: 2023/2/27
 */
@Service
public class RankListServiceImpl extends ServiceImpl<RankListMapper, RankList> implements RankListService {


    @Autowired
    private RankListMapper rankMapper;

    @Override
    public R addRank(RankListRequest rankListAddRequest) {
        RankList rankList = new RankList();
        BeanUtils.copyProperties(rankListAddRequest, rankList);
        if (rankMapper.insert(rankList) > 0) {
            return R.success("评价成功");
        } else {
            return R.error("评价失败");
        }
    }

    @Override
    public R rankOfSongListId(Long songListId) {
        // 评分总人数如果为 0，则返回0；否则返回计算出的结果
        QueryWrapper<RankList> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("song_list_id",songListId);
        Long rankNum = rankMapper.selectCount(queryWrapper);
        return R.success(null, (rankNum <= 0) ? 0 : rankMapper.selectScoreSum(songListId) / rankNum);
    }

    @Override
    public R getUserRank(Long consumerId, Long songListId) {
        return R.success(null, rankMapper.selectUserRank(consumerId, songListId));
    }
}
