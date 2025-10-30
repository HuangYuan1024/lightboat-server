package com.huangyuan.saleboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.huangyuan.saleboot", "com.huangyuan.saleinterface", "com.huangyuan.lightboatspringbootstarterweb"})
public class SaleBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaleBootApplication.class, args);
    }

}
