package com.xalf.starter;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyListener extends CustomContextListener {

    public MyListener(CustomProperties customProperties) {
        super(customProperties);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("event = " + contextRefreshedEvent);
    }
}
