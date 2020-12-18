package com.xalf.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties({CustomProperties.class}) //чтоб класс появился как бин внутри контекста
                                                         //класс должен появляться чуть раньше чем остальные бины
                                                         //чтоб остальные бины его могли юзать
public class App {

//    @Bean
//    //бин с именем customContextListener перебивает бин из CustomConfiguration.customContextListener
//    public MyListener customContextListener(CustomProperties customProperties) {
//        return new MyListener(customProperties);
//    }

//    @Bean
//    public MyListener myListener(CustomProperties customProperties) {
//        return new MyListener(customProperties);
//    }

//    @Bean
//    public CustomContextListener customContextListener(CustomProperties customProperties) {
//        return new CustomContextListener(customProperties);
//    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
