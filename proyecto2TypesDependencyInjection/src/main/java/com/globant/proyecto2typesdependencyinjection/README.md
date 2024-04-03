# Inyección de Dependencias en Spring

Este proyecto demuestra los tres tipos principales de inyección de dependencias en el framework Spring de Java:

1. Inyección por constructor
2. Inyección por setter
3. Inyección por atributo

## Descripción

La inyección de dependencias es un patrón de diseño fundamental en el desarrollo de software que permite a las clases ser independientes de la creación de sus dependencias. En su lugar, las dependencias son proporcionadas (o "inyectadas") a la clase, típicamente por un framework como Spring.

Este proyecto incluye tres paquetes, cada uno demostrando un tipo diferente de inyección de dependencias:

- `com.globant.proyecto2typesdependencyinjection.attribute`: Demuestra la inyección por atributo.
- `com.globant.proyecto2typesdependencyinjection.constructor`: Demuestra la inyección por constructor.
- `com.globant.proyecto2typesdependencyinjection.setter`: Demuestra la inyección por setter.

## Cómo ejecutar el proyecto

1. Asegúrate de tener Java y Maven instalados en tu sistema.
2. Clona este repositorio y navega al directorio del proyecto.
3. Ejecuta `mvn spring-boot:run` para iniciar la aplicación.
4. La aplicación expondrá endpoints para cada tipo de inyección de dependencias. Puedes probarlos usando una herramienta como curl o Postman.

## Requisitos

- Java 17 o superior
- Maven 3.6.0 o superior

## Más información

Para más información sobre la inyección de dependencias en Spring, consulta la [documentación oficial de Spring](https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-spring-beans-and-dependency-injection).

Si tienes alguna pregunta o sugerencia sobre este proyecto, no dudes en abrir un issue o enviar un pull request.