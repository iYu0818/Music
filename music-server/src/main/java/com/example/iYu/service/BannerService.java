package com.example.iYu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.iYu.model.domain.Banner;

import java.util.List;
/**
 * @Description:针对表【banner】的数据库操作Service
 * @Param:
 * @return:
 * @Author: 程煜
 * @Date: 2023/2/26
 */
public interface BannerService extends IService<Banner> {

    List<Banner> getAllBanner();

}
