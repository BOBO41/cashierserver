package com.archy.cash;

import com.archy.cash.service.CashService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.Resource;

@MapperScan("com.mingyang.cash.dao.mapper")
@EnableScheduling
@SpringBootApplication
public class SecorderApplication extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(SecorderApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(SecorderApplication.class);
    }

}
