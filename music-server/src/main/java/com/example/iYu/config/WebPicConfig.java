package com.example.iYu.config;

import com.example.iYu.constant.Constants;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
* @Description:  集中一下图像的配置类，静态资源初步位置，这个配置类的目的是什么  就是注册了一个类似于拦截器  看到对应的资源 会将其修改成相应的地址
* @Param:
* @return:
* @Author: 程煜
* @Date: 2023/3/8
*/
@Configuration
public class WebPicConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/avatorImages/**")
                .addResourceLocations(Constants.AVATOR_IMAGES_PATH);
        registry.addResourceHandler("/img/singerPic/**")
                .addResourceLocations(Constants.SINGER_PIC_PATH);
        registry.addResourceHandler("/img/songPic/**")
                .addResourceLocations(Constants.SONG_PIC_PATH);
        registry.addResourceHandler("/song/**")
                .addResourceLocations(Constants.SONG_PATH);
        registry.addResourceHandler("/img/songListPic/**")
                .addResourceLocations(Constants.SONGLIST_PIC_PATH);
        registry.addResourceHandler("/img/swiper/**")
                .addResourceLocations(Constants.BANNER_PIC_PATH);
    }

}
