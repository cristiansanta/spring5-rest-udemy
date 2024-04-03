package com.globant.proyecto3qualifiers.qualifiers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("pajarito")
public class Pajaro extends Animal implements Volador{

    private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

    public Pajaro(@Value("PÁJARO LOCO") String nombre,@Value("2") Integer edad) {
        super(edad, nombre);
    }

    @Override
    public void volar() {
        log.info("Soy un pájaro y estoy Volando");
    }
}
