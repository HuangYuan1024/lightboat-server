package com.huangyuan.seckillboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.huangyuan.seckillboot", "com.huangyuan.seckillinterface", "com.huangyuan.lightboatspringbootstarterweb"})
public class SeckillBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillBootApplication.class, args);
    }

}
