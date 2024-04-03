# Curso de Spring Boot - Udemy

Este monorepo contiene todos los proyectos desarrollados durante el curso de Spring Boot de Udemy. Cada proyecto se enfoca en un aspecto o funcionalidad específica de Spring Boot, siguiendo la estructura del curso.

## Proyectos Incluidos

1. **Core de Spring**
    - [Inyección de dependencias](./proyecto-inyeccion-dependencias/)
    - [Ciclo de vida de las aplicaciones de spring](./proyecto-ciclo-vida/)
    - [Perfiles](./proyecto-perfiles/)
    - [Qualifiers](./proyecto-qualifiers/)

2. **Core de Spring, conceptos avanzados**
    - [Scopes](./proyecto-scopes/)
    - [Definición explícita de los beans](./proyecto-definicion-beans/)
    - [Inyección de múltiples objetos](./proyecto-inyeccion-multiple/)
    - [Carga de propiedades](./proyecto-carga-propiedades/)
    - [Uso de SpEL](./proyecto-spel/)

3. **Ciclo de vida de los beans de Spring**
    - [Aware interfaces](./proyecto-aware-interfaces/)
    - [Callbacks](./proyecto-callbacks/)
    - [Reglas al utilizar callbacks](./proyecto-reglas-callbacks/)
    - [Eager vs Lazy](./proyecto-eager-lazy/)
    - [BeanFactoryPostProcessor](./proyecto-beanfactorypostprocessor/)

4. **Aspect oriented programming**
    - [Conceptos básicos](./proyecto-aop-conceptos-basicos/)
    - [Tipos de advices](./proyecto-aop-tipos-advices/)
    - [Configuración y creación de un aspecto](./proyecto-aop-configuracion/)
    - [Accediendo a la información del Join point](./proyecto-aop-joinpoint/)
    - [Definición de precedencia](./proyecto-aop-precedencia/)

5. **Http**
    - [Conceptos básicos](./proyecto-http-conceptos-basicos/)
    - [Métodos HTTP](./proyecto-http-metodos/)
    - [Peticiones y respuestas](./proyecto-http-peticiones-respuestas/)
    - [Connection less y stateless](./proyecto-http-connectionless-stateless/)
    - [Status HTTP](./proyecto-http-status/)
    - [Definición de recursos](./proyecto-http-recursos/)
    - [Versionamiento](./proyecto-http-versionamiento/)

6. **Web services REST**
    - [Configuración](./proyecto-rest-configuracion/)
    - [Spring MVC](./proyecto-rest-spring-mvc/)
    - [Definición de controllers](./proyecto-rest-controllers/)
    - [Configuración de Java Faker](./proyecto-rest-java-faker/)
    - [Endpoint para obtener usuarios](./proyecto-rest-get-usuarios/)
    - [Uso de Postman](./proyecto-rest-postman/)
    - [Endpoint para crear usuarios](./proyecto-rest-crear-usuarios/)
    - [Endpoint para actualizar usuarios](./proyecto-rest-actualizar-usuarios/)
    - [Endpoint para borrar usuarios](./proyecto-rest-borrar-usuarios/)
    - [Uso de query params y path params](./proyecto-rest-params/)

7. **Java Persistence Api + H2 (In memory databases)**
    - [Conceptos básicos de JPA](./proyecto-jpa-conceptos-basicos/)
    - [Relaciones OneToOne ManyToOne y OneToMany](./proyecto-jpa-relaciones/)
    - [Introducción y configuración de H2](./proyecto-h2/)
    - [Creando entidades](./proyecto-jpa-entidades/)

8. **Spring Data + Java Persistence Api**
    - [Proyecto Spring Data JPA](./proyecto-spring-data-jpa/)

9. **Uso de métricas y Actuator (Prometheus, Micrometer y Grafana)**
    - [Proyecto Actuator](./proyecto-actuator/)

10. **Documentación con swagger**
    - [Proyecto Swagger](./proyecto-swagger/)

11. **Spring Cache (Redis)**
    - [Proyecto Spring Cache Redis](./proyecto-spring-cache-redis/)

12. **Complementando el ejemplo práctico**
    - [Proyecto Ejemplo Práctico](./proyecto-ejemplo-practico/)

13. **Seguridad utilizando Spring Security**
    - [Proyecto Spring Security](./proyecto-spring-security/)

14. **Conceptos avanzados de autorización**
    - [Proyecto Autorización Avanzada](./proyecto-autorizacion-avanzada/)

15. **Apache Kafka con Spring Framework**
    - [Proyecto Apache Kafka](./proyecto-apache-kafka/)

## Configuración del Entorno de Desarrollo

Para trabajar con estos proyectos, asegúrate de tener instalado lo siguiente en tu sistema:

- Java 17 o superior
- Maven 3.6.0 o superior
- IntelliJ IDEA (u otro IDE de tu elección)
- Docker (para proyectos que usan bases de datos u otras herramientas)

Clona este repositorio en tu máquina local usando:

```bash
git clone https://github.com/cristiansanta/spring5-rest-udemy.git