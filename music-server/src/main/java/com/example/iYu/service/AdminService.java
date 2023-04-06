package com.example.iYu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.iYu.common.R;
import com.example.iYu.model.domain.Admin;
import com.example.iYu.model.request.AdminRequest;

import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: 程煜
 * @Date: 2023/2/26
 */
public interface AdminService extends IService<Admin> {

    R verityPasswd(AdminRequest adminRequest, HttpSession session);
}
