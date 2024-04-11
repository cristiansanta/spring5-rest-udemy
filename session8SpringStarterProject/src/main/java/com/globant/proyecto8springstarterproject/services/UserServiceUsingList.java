package com.globant.proyecto8springstarterproject.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.github.javafaker.Faker;
import com.globant.proyecto8springstarterproject.models.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserServiceUsingList {
    @Autowired
    private Faker faker;
    private List<User> users = new ArrayList<>();
    @PostConstruct
    public void init(){
        for (int i=0;i<=101;i++){
            users.add(new User(faker.funnyName().name(), faker.name().username(), faker.dragonBall().character()));
        }
    }
    public List<User> getUsers(String startwith) {
        if(startwith != null){
            return users.stream().filter(u -> u.getUsername().startsWith(startwith)).collect(Collectors.toList());
        }else{
            return users;
        }
    }
    public User getUserByUsername(String username){
        return users.stream().filter(u -> u.getUsername().equals(username))
                .findAny().orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        String.format("User %s not Found ", username)));
    }
    public User createUser(User user){
        if (users.stream().anyMatch(u->u.getUsername().equals(user.getUsername()))){
            throw new ResponseStatusException(HttpStatus.CONFLICT,
                    String.format("User %s already exists", user.getUsername()));
        }
        users.add(user);
        return user;
    }
    public User updateUser(User user, String username){
        User userToBeUpdated = getUserByUsername(username);
        userToBeUpdated.setNickName(user.getNickName());
        userToBeUpdated.setPassword(user.getPassword());
        return userToBeUpdated;
    }
    public void deleteUser(String username){
        User userByUsername = getUserByUsername(username);
        users.remove(userByUsername);
    }
}