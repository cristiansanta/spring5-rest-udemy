package com.globant.proyecto6inyeccionmultiplesobjetos.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CIrcule implements Figure{
    @Value("2.5")
    private double radius;
    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
