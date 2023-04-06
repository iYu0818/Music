package com.example.iYu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.iYu.model.domain.RankList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
* @Description: 评分mapper
* @Param:
* @return:
* @Author: 程煜
* @Date: 2023/2/23
*/
@Repository
public interface RankListMapper extends BaseMapper<RankList> {

    /**
     * 查总分
     * @param songListId
     * @return
     */
    int selectScoreSum(Long songListId);

    /**
     * 查制定用户评分
     * @param consumerId
     * @param songListId
     * @return
     */
    int selectUserRank(@Param("consumer_id") Long consumerId, @Param("song_list_id")  Long songListId);
}
