package com.po.pf.potucs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Auther wangzekun
 * @Date 2020/7/28 09:28
 * @Description
 */
@SpringBootApplication
@MapperScan("com.po.pf.repository")//扫描的mapper
public class PoTuApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        //启动spring应用程序
        SpringApplication.run(PoTuApplication.class,args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PoTuApplication.class);
    }
}
