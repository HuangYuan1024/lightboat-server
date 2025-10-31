package com.huangyuan.userboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.huangyuan.userinfrastructure.mapper")
@ComponentScan(basePackages = {"com.huangyuan.userboot", "com.huangyuan.userinterface", "com.huangyuan.lightboatspringbootstarterweb"})
public class UserBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserBootApplication.class, args);
    }

}
