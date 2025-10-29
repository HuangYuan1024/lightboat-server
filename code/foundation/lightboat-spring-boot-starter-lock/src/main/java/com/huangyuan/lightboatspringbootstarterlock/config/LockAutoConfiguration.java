package com.huangyuan.lightboatspringbootstarterlock.config;

import com.huangyuan.lightboatspringbootstarterlock.aspect.DistributedLockAspect;
import org.redisson.api.RedissonClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "love.lock.enabled", matchIfMissing = true)
public class LockAutoConfiguration {

    @Bean
    public DistributedLockAspect distributedLockAspect(RedissonClient client) {
        return new DistributedLockAspect(client);
    }
}
