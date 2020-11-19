package com.auto.autoconfig.common.config;


import com.auto.autoconfig.common.config.domain.DemoDomain;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

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
