package com.huangyuan.lightboatsdkopenfeign.config;


import com.huangyuan.lightboatsdkopenfeign.interceptor.GrayTagInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "love.feign.enabled", matchIfMissing = true)
public class OpenFeignSdkAutoConfiguration {

    @Bean("grayTagInterceptor")
    @ConditionalOnMissingBean
    public GrayTagInterceptor grayTagInterceptor() {
        return new GrayTagInterceptor();
    }
}




