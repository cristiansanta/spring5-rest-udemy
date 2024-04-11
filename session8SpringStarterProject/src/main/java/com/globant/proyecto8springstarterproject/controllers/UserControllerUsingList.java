package com.globant.proyecto8springstarterproject.controllers;

import com.globant.proyecto8springstarterproject.models.User;
import com.globant.proyecto8springstarterproject.services.UserServiceUsingList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/users")//recurso definido aqui
public class UserControllerUsingList {
    @Autowired
    private UserServiceUsingList userService;
    //Query param
    @GetMapping//método http aquí
    //Estos métodos se llaman HANDLER METHODS y son ejecutados a traves de:
    //Metodo HTTP + 1 Recurso = HANDLER METHOD
    public ResponseEntity<List<User>> getUsers(@RequestParam(value = "startwith", required = false)String startwith ){
        return new ResponseEntity<List<User>>(userService.getUsers(startwith), HttpStatus.OK);
    }
    @GetMapping(value = "/{username}")//Path param
    public ResponseEntity<User> getUserByUsername(@PathVariable("username") String username){
        return new ResponseEntity<User>(userService.getUserByUsername(username), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<User> createUSer(@RequestBody User user){
        return new ResponseEntity<User>(userService.createUser(user), HttpStatus.CREATED);
    }
    @PutMapping("/{username}")
    public ResponseEntity<User> updateUser(@PathVariable("username") String username, @RequestBody User user){
        return new ResponseEntity<User>(userService.updateUser(user, username), HttpStatus.OK);
    }
    @DeleteMapping("/{username}")
    public ResponseEntity<Void> deleteUser(@PathVariable("username") String username){
        userService.deleteUser((username));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}