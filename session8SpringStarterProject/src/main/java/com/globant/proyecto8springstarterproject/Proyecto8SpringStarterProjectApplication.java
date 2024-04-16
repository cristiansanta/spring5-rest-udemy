package com.globant.proyecto8springstarterproject;

import com.github.javafaker.Faker;
import com.globant.proyecto8springstarterproject.entities.Role;
import com.globant.proyecto8springstarterproject.entities.User;
import com.globant.proyecto8springstarterproject.entities.UserInRole;
import com.globant.proyecto8springstarterproject.repositories.RoleRepository;
import com.globant.proyecto8springstarterproject.repositories.UserInRoleRespository;
import com.globant.proyecto8springstarterproject.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class Proyecto8SpringStarterProjectApplication implements ApplicationRunner {
    @Autowired
    private Faker faker;
    @Autowired
    private UserRepository repository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserInRoleRespository userInRoleRespository;
    private static final Logger log = LoggerFactory.getLogger(Proyecto8SpringStarterProjectApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(Proyecto8SpringStarterProjectApplication.class, args);
    }
    @Override
    public void run(ApplicationArguments args) throws Exception{
        Role roles[] = {new Role("ADMIN"), new Role("SUPPORT"), new Role("USER")};
        for (Role role: roles){
            roleRepository.save(role);
        }
        for (int i=0;i<11000;i++){
            User user = new User();
            user.setUsername(faker.name().username());
            user.setPassword(faker.dragonBall().character());
            User created = repository.save(user);
            UserInRole userInRole=new UserInRole(created,roles[new Random().nextInt(3)]);
            log.info("User created username {} password {} role {} ", created.getUsername(),created.getPassword(),userInRole.getRole().getName());
            userInRoleRespository.save(userInRole);
        }
    }
}
