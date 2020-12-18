package com.xalf.starter;

import com.xalf.starter.annotation.ConditionalOnEnabled;
import com.xalf.starter.annotation.ConditionalOnProd;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {

    @Bean
    @ConditionalOnProd
    //@ConditionalOnProperty("myproperties.values") - заменили на ConditionalOnEnabled
    @ConditionalOnEnabled
    //@ConditionalOnMissingBean
    public CustomContextListener customContextListener(CustomProperties customProperties) {
        return new CustomContextListener(customProperties);
    }

}
