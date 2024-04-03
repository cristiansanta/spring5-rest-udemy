package com.globant.proyecto6inyeccionmultiplesobjetos;

import com.globant.proyecto6inyeccionmultiplesobjetos.autowired.ArreaCalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Proyecto6INyeccionMultiplesObjetosApplication {
    private static final Logger log = LoggerFactory.getLogger(Proyecto6INyeccionMultiplesObjetosApplication.class);
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Proyecto6INyeccionMultiplesObjetosApplication.class, args);
        ArreaCalculatorService calculator = context.getBean(ArreaCalculatorService.class);
        log.info("Area total {} ",calculator.calcAreas());
    }

}