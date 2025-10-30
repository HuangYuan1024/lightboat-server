package com.huangyuan.contentboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.huangyuan.contentboot", "com.huangyuan.contentinterface", "com.huangyuan.lightboatspringbootstarterweb"})
public class ContentBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContentBootApplication.class, args);
    }

}
