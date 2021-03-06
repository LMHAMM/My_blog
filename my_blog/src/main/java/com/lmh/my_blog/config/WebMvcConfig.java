package com.lmh.my_blog.config;

import com.lmh.my_blog.handler.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;



    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //跨域配置
        registry.addMapping("/**").allowedOrigins("http://localhost:8080");
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截test接口，后续根据实际遇到的进行更改
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/test");
    }
}
