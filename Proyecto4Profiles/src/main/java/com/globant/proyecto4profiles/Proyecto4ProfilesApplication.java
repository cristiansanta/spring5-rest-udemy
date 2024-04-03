package com.globant.proyecto4profiles;

import com.globant.proyecto4profiles.profiles.EnvironmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Proyecto4ProfilesApplication {
    private static final Logger log = LoggerFactory.getLogger(Proyecto4ProfilesApplication.class);
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Proyecto4ProfilesApplication.class, args);
        EnvironmentService environmentService = context.getBean(EnvironmentService.class);
        log.info("Active environment {} ", environmentService.getEnvironment());
    }

}