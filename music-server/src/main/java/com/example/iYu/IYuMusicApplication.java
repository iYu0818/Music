package com.example.iYu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @Description: 启动类
* @Param:
* @return:
* @Author: 程煜
* @Date: 2023/2/1
*/
@SpringBootApplication
@MapperScan("com.example.iYu.mapper")
public class IYuMusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(IYuMusicApplication.class, args);
    }

}

