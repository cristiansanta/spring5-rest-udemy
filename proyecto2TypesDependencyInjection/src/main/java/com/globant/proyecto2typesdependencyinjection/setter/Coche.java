package com.globant.proyecto2typesdependencyinjection.setter;

import com.globant.proyecto2typesdependencyinjection.setter.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Coche {
    private String marca;
    private Integer modelo;
    private Motor motor;
    @Value("Volkswagen")
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Value("1995")
    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }
    @Autowired //Motor es una instancia de una clase que posiblemente requiere su propia configuración y gestión de ciclo de vida
    public void setMotor(Motor motor) {
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