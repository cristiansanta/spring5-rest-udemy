package com.globant.proyecto1helloworld.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloW0rld")
public class HelloWorldController {
    @GetMapping
    public ResponseEntity<String> helloWorld(){
        return new ResponseEntity<>("Hola Mundo Spring", HttpStatus.OK);
    }
}
