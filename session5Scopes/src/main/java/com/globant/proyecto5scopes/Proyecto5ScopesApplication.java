package com.globant.proyecto5scopes;

import com.globant.proyecto5scopes.scopes.EjemploScopeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Proyecto5ScopesApplication {
    private static final Logger log = LoggerFactory.getLogger(Proyecto5ScopesApplication.class);
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Proyecto5ScopesApplication.class, args);
        EjemploScopeService ejemploScopeService = context.getBean(EjemploScopeService.class);
        EjemploScopeService ejemploScopeService1 = context.getBean(EjemploScopeService.class);

        log.info("Are beans equal {} ",ejemploScopeService.equals(ejemploScopeService1));
        log.info("Are BEANS =={}",ejemploScopeService==ejemploScopeService1);
    }
}