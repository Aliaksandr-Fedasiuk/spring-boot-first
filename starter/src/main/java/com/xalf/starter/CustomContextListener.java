package com.xalf.starter;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@RequiredArgsConstructor
public class CustomContextListener implements ApplicationListener<ContextRefreshedEvent> {

    //@Autowired - или это использовать
    private final CustomProperties customProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("===================================================");
        System.out.println("Context refresh...");
        customProperties.getValues().forEach(System.out::println);
        System.out.println("===================================================");
    }
}
