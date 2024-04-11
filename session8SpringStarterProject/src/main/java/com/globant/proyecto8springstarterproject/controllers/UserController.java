package com.globant.proyecto8springstarterproject.controllers;

import com.globant.proyecto8springstarterproject.entities.User;
import com.globant.proyecto8springstarterproject.services.UserService;
import io.micrometer.core.annotation.Timed;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;
    private final ObservationRegistry observationRegistry;

    public UserController(UserService service, ObservationRegistry observationRegistry) {
        this.service = service;
        this.observationRegistry = observationRegistry;
    }
    @GetMapping
    public ResponseEntity<Page<User>> getUsers(
            @RequestParam(required = false, value = "page", defaultValue = "0") int page,
            @RequestParam(required = false, value = "size", defaultValue = "1000") int size) {
        return Observation.createNotStarted("get.users", observationRegistry)
                .observe(() -> {
                    Page<User> users = service.getUsers(page, size);
                    return new ResponseEntity<>(users, HttpStatus.OK);
                });
    }
    @GetMapping("/usernames")
    private ResponseEntity<Page<String>> getUsernames(
            @RequestParam(required = false, value = "page", defaultValue = "0")int page,
            @RequestParam(required = false, value = "size", defaultValue = "1000")int size){
        return new ResponseEntity<>(service.getUsernames(page, size), HttpStatus.OK);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId")Integer userId){
        return new ResponseEntity<>(service.getUserById(userId), HttpStatus.OK);
    }
    @GetMapping("/username/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable("username")String username){
        return new ResponseEntity<>(service.getUserByUsername(username), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<User> authenticate(@RequestBody User user){
        return new ResponseEntity<>(service.getUserByUsernameAndPassword(user.getUsername(), user.getPassword()),
                HttpStatus.OK);
    }
}