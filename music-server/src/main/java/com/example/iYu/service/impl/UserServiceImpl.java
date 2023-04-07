package com.example.iYu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.iYu.common.R;
import com.example.iYu.constant.Constants;
import com.example.iYu.mapper.UserMapper;
import com.example.iYu.model.request.UserRequest;
import com.example.iYu.service.UserService;
import com.example.iYu.model.domain.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Autowired
    private UserMapper userMapper;


    /**
     * 新增用户
     */
    @Override
    public R addUser(UserRequest registryRequest) {
        if (this.existUser(registryRequest.getUsername())) {
            return R.warning("用户名已注册");
        }
        User user = new User();
        BeanUtils.copyProperties(registryRequest, user);
        //MD5加密
        String password = DigestUtils.md5DigestAsHex((Constants.SALT + registryRequest.getPassword()).getBytes(StandardCharsets.UTF_8));
        user.setPassword(password);
        //都用用
        if (StringUtils.isBlank(user.getPhoneNum())) {
            user.setPhoneNum(null);
        }
        if ("".equals(user.getEmail())) {
            user.setEmail(null);
        }
        user.setAvator("img/avatorImages/user.jpg");
        try {
            if (userMapper.insert(user) > 0) {
                return R.success("注册成功");
            } else {
                return R.error("注册失败");
            }
        } catch (DuplicateKeyException e) {
            return R.fatal(e.getMessage());
        }
    }

    @Override
    public R updateUserMsg(UserRequest updateRequest) {
        User user = new User();
        BeanUtils.copyProperties(updateRequest, user);
        if (userMapper.updateById(user) > 0) {
            return R.success("修改成功");
        } else {
            return R.error("修改失败");
        }
    }

    @Override
    public R updatePassword(UserRequest updatePasswordRequest) {

       if (!this.verityPasswd(updatePasswordRequest.getUsername(),updatePasswordRequest.getOldPassword())) {
            return R.error("密码输入错误");
        }

        User user = new User();
        user.setId(updatePasswordRequest.getId());
        String secretPassword = DigestUtils.md5DigestAsHex((Constants.SALT + updatePasswordRequest.getPassword()).getBytes(StandardCharsets.UTF_8));
        user.setPassword(secretPassword);

        if (userMapper.updateById(user) > 0) {
            return R.success("密码修改成功");
        } else {
            return R.error("密码修改失败");
        }
    }

    @Override
    public R updateUserAvator(MultipartFile avatorFile, int id) {
        String fileName = System.currentTimeMillis() + avatorFile.getOriginalFilename();
        //路径 他这个会根据你的系统获取对应的文件分隔符
        String filePath = Constants.PROJECT_PATH + System.getProperty("file.separator") + "img" + System.getProperty("file.separator") + "avatorImages";
        File file = new File(filePath);
        if (!file.exists() && !file.mkdir()) {
            return R.fatal("创建文件失败");
        }
        File dest = new File(filePath + System.getProperty("file.separator") + fileName);
        String imgPath = "/img/avatorImages/" + fileName;
        try {
            avatorFile.transferTo(dest);
        } catch (IOException e) {
            return R.fatal("上传失败" + e.getMessage());
        }
        User user = new User();
        user.setId(id);
        user.setAvator(imgPath);
        if (userMapper.updateById(user) > 0) {
            return R.success("上传成功", imgPath);
        } else {
            return R.error("上传失败");
        }
    }

    @Override
    public boolean existUser(String username) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        return userMapper.selectCount(queryWrapper) > 0;
    }

    @Override
    public boolean verityPasswd(String username, String password) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        String secretPassword = DigestUtils.md5DigestAsHex((Constants.SALT + password).getBytes(StandardCharsets.UTF_8));

        queryWrapper.eq("password",secretPassword);
        return userMapper.selectCount(queryWrapper) > 0;
    }

    // 删除用户
    @Override
    public R deleteUser(Integer id) {
        if (userMapper.deleteById(id) > 0) {
            return R.success("删除成功");
        } else {
            return R.error("删除失败");
        }
    }

    @Override
    public R allUser() {
        return R.success(null, userMapper.selectList(null));
    }

    @Override
    public R userOfId(Integer id) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return R.success(null, userMapper.selectList(queryWrapper));
    }

    @Override
    public R loginStatus(UserRequest loginRequest, HttpSession session) {

        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        if (this.verityPasswd(username, password)) {
            session.setAttribute("username", username);
            User user = new User();
            user.setUsername(username);
            return R.success("登录成功", userMapper.selectList(new QueryWrapper<>(user)));
        } else {
            return R.error("用户名或密码错误");
        }
    }
}
