package com.xalf.starter;

import com.xalf.starter.annotation.ConditionalOnProd;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {

    @Bean
    @ConditionalOnProd
    @ConditionalOnProperty("myproperties.values")
    @ConditionalOnMissingBean
    public CustomContextListener customContextListener(CustomProperties customProperties) {
        return new CustomContextListener(customProperties);
    }

}
