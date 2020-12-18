package com.xalf.starter;

import com.xalf.starter.annotation.ConditionalOnProd;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({CustomProperties.class}) //чтоб класс появился как бин внутри контекста
                                                         //класс должен появляться чуть раньше чем остальные бины
                                                         //чтоб остальные бины его могли юзать
public class CustomConfiguration {

    @Bean
    @ConditionalOnProd
    @ConditionalOnProperty("myproperties.values")
    public CustomContextListener customContextListener(CustomProperties customProperties) {
        return new CustomContextListener(customProperties);
    }

}
