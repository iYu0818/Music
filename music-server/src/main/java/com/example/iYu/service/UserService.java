package com.example.iYu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.iYu.common.R;
import com.example.iYu.model.domain.User;
import com.example.iYu.model.request.UserRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

/**
* @Description:
* @Param:
* @return:
* @Author: 程煜
* @Date: 2023/2/26
*/
public interface UserService extends IService<User> {

    R addUser(UserRequest registryRequest);

    R updateUserMsg(UserRequest updateRequest);

    R updateUserAvator(MultipartFile avatorFile, int id);

    R updatePassword(UserRequest updatePasswordRequest);

    boolean existUser(String username);

    boolean verityPasswd(String username, String password);

    R deleteUser(Integer id);

    R allUser();

    R userOfId(Integer id);

    R loginStatus(UserRequest loginRequest, HttpSession session);

}
