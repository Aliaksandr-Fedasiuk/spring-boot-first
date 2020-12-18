package com.xalf.starter;

import com.xalf.starter.annotation.ConditionalOnProd;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {

    @Bean
    @ConditionalOnProd
    public CustomContextListener customContextListener() {
        return new CustomContextListener();
    }

}
