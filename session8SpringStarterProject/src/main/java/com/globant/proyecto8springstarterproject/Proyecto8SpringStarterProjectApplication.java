package com.globant.proyecto8springstarterproject;

import com.github.javafaker.Faker;
import com.globant.proyecto8springstarterproject.entities.User;
import com.globant.proyecto8springstarterproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Proyecto8SpringStarterProjectApplication implements ApplicationRunner {
    @Autowired
    private Faker faker;
    @Autowired
    private UserRepository repository;
    public static void main(String[] args) {
        SpringApplication.run(Proyecto8SpringStarterProjectApplication.class, args);
    }
    @Override
    public void run(ApplicationArguments args) throws Exception{
        for (int i=0;i<11000;i++){
            User user = new User();
            user.setUsername(faker.name().username());
            user.setPassword(faker.dragonBall().character());
            repository.save(user);
        }
    }
}
