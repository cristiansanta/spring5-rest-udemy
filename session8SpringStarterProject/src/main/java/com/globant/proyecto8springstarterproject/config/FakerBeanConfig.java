package com.globant.proyecto8springstarterproject.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakerBeanConfig {
    @Bean
    public Faker getFaker(){
        return new Faker();
    }
}
