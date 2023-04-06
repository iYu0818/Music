package com.example.iYu.controller;

import com.example.iYu.service.UserService;
import com.example.iYu.common.R;
import com.example.iYu.model.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;


/**
* @Description: 用户controller
* @Param:
* @return:
* @Author: 程煜
* @Date: 2023/2/6
*/
@RestController
public class UserController {

    //注入UserService
    @Autowired
    private UserService userService;


    //前台页面调用 注册 用户注册
    @PostMapping("/user/add")
    public R addUser(@RequestBody UserRequest registryRequest) {
        return userService.addUser(registryRequest);
    }

    //前台页面调用  登录  登录判断
    @PostMapping("/user/login/status")
    public R loginStatus(@RequestBody UserRequest loginRequest, HttpSession session) {
        return userService.loginStatus(loginRequest, session);
    }

    //管理界面调用,返回所有用户
    @GetMapping("/user")
    public R allUser() {
        return userService.allUser();
    }


    //用户界面调用,返回指定ID的用户
    @GetMapping("/user/detail")
    public R userOfId(@RequestParam int id) {
        return userService.userOfId(id);
    }

    //管理界面的调用,删除用户
    @GetMapping("/user/delete")
    public R deleteUser(@RequestParam int id) {
        return userService.deleteUser(id);
    }

    //前后台界面的调用,更新用户信息
    @PostMapping("/user/update")
    public R updateUserMsg(@RequestBody UserRequest updateRequest) {
        return userService.updateUserMsg(updateRequest);
    }

    //前后台更新用户的密码,更新用户密码
    @PostMapping("/user/updatePassword")
    public R updatePassword(@RequestBody UserRequest updatePasswordRequest) {
        return userService.updatePassword(updatePasswordRequest);
    }

    //更新用户头像
    @PostMapping("/user/avatar/update")
    public R updateUserPic(@RequestParam("file") MultipartFile avatorFile, @RequestParam("id") int id) {
        return userService.updateUserAvator(avatorFile, id);
    }
}
