package com.example.iYu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.iYu.common.R;
import com.example.iYu.model.domain.UserSupport;
import com.example.iYu.model.request.UserSupportRequest;

/**
* @Description: 针对表【user_support】的数据库操作Service
* @Param:
* @return:
* @Author: 程煜
* @Date: 2023/2/26
*/
public interface UserSupportService extends IService<UserSupport> {

    R isUserSupportComment(UserSupportRequest userSupportRequest);

    R insertCommentSupport(UserSupportRequest userSupportRequest);

    R deleteCommentSupport(UserSupportRequest userSupportRequest);
}
