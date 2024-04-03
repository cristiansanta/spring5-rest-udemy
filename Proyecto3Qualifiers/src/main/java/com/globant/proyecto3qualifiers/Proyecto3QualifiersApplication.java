package com.globant.proyecto3qualifiers;

import com.globant.proyecto3qualifiers.qualifiers.Animal;
import com.globant.proyecto3qualifiers.qualifiers.Avion;
import com.globant.proyecto3qualifiers.qualifiers.Pajaro;
import com.globant.proyecto3qualifiers.qualifiers.Perro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Proyecto3QualifiersApplication {
    private static final Logger log = LoggerFactory.getLogger(Proyecto3QualifiersApplication.class);
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Proyecto3QualifiersApplication.class, args);
        Animal animal = context.getBean(Animal.class);//Aquí se especifica el Qualifier
        log.info("Animal nombre= {} edad={}", animal.getNombre(), animal.getEdad());
    }
}