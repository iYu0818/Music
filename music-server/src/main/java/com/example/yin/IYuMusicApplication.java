package com.example.yin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.yin.mapper")
public class IYuMusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(IYuMusicApplication.class, args);
    }

}

