package com.base.autoconfig.common.config;


import com.base.autoconfig.common.config.domain.DemoDomain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 加载bean
 */
@Configuration
public class AutoLoadBeanConfiguration {
    @Bean
    public DemoDomain DemoDomain() {
        DemoDomain demoDomain = new DemoDomain();
        demoDomain.setName("杨心圆");
        demoDomain.setSex(25);
        return demoDomain;
    }
}
