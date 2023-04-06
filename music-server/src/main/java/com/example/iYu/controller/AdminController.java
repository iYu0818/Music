package com.example.iYu.controller;

import com.example.iYu.common.R;
import com.example.iYu.model.request.AdminRequest;
import com.example.iYu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
* @Description: 后台管理员管理
* @Param:
* @return:
* @Author: 程煜
* @Date: 2023/2/26
*/
@RestController
public class AdminController {

    //注入Adminservice
    @Autowired
    private AdminService adminService;
    // 判断是否登录成功
    @PostMapping("/admin/login/status")
    public R loginStatus(@RequestBody AdminRequest adminRequest, HttpSession session) {
        return adminService.verityPasswd(adminRequest, session);
    }
}
