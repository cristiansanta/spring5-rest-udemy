/*package com.globant.proyecto2typesdependencyinjection.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Coche {
    private String marca;
    private Integer modelo;
    private Motor motor;
    @Autowired //Motor es una instancia de una clase que posiblemente requiere su propia configuración y gestión de ciclo de vida
    public Coche(@Value("Volkswagen")String marca, @Value("1995")Integer modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", motor=" + motor +
                '}';
    }
}
*/