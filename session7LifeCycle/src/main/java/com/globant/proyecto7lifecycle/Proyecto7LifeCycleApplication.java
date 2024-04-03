package com.globant.proyecto7lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Proyecto7LifeCycleApplication {
    private static final Logger log = LoggerFactory.getLogger(Proyecto7LifeCycleApplication.class);
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Proyecto7LifeCycleApplication.class, args);
        LifeCycle bean = context.getBean(LifeCycle.class);

    }
}