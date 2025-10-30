package com.huangyuan.productboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.huangyuan.productboot", "com.huangyuan.productinterface", "com.huangyuan.lightboatspringbootstarterweb"})
public class ProductBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductBootApplication.class, args);
    }

}
