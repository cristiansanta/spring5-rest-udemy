/*package com.globant.proyecto2typesdependencyinjection.attribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Coche {
    @Value("Volkswagen")
    private String marca;
    @Value("1981")
    private Integer modelo;
    @Autowired //Motor es una instancia de una clase que posiblemente requiere su propia configuración y gestión de ciclo de vida
    private Motor motor;

    public Coche() {
    }

    public Coche(String marca, Integer modelo, Motor motor) {
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