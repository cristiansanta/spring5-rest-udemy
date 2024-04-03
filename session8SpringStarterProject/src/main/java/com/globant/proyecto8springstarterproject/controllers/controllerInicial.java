package com.globant.proyecto8springstarterproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//
@RequestMapping("/jelou")
public class controllerInicial {
    @GetMapping
    public String helloworld(){
        return "¡ Hello world !";
    }
}