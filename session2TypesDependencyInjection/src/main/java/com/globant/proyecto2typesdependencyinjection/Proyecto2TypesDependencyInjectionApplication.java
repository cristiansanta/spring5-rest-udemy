package com.globant.proyecto2typesdependencyinjection;

import com.globant.proyecto2typesdependencyinjection.setter.Motor;
import com.globant.proyecto2typesdependencyinjection.setter.Coche;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Proyecto2TypesDependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Proyecto2TypesDependencyInjectionApplication.class, args);
		Coche coche = context.getBean(Coche.class);
		System.out.println(coche);
	}
}