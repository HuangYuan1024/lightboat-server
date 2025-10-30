package com.huangyuan.categoryboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.huangyuan.categoryboot", "com.huangyuan.categoryinterface", "com.huangyuan.lightboatspringbootstarterweb"})
public class CategoryBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CategoryBootApplication.class, args);
    }

}
