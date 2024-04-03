package com.globant.proyecto3qualifiers.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Perro extends Animal{
    public Perro(@Value("1") Integer edad,@Value("Rocky") String nombre) {
        super(edad, nombre);
    }
}
