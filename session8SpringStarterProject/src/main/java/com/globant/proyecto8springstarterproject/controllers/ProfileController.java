package com.globant.proyecto8springstarterproject.controllers;

import com.globant.proyecto8springstarterproject.entities.Profile;
import com.globant.proyecto8springstarterproject.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/users/{userId}/profiles")
@RestController
public class ProfileController {
    @Autowired
    private ProfileService service;
    @PostMapping
    public ResponseEntity<Profile> create(@PathVariable("userId") Integer userId, @RequestBody Profile profile){
        return new ResponseEntity<Profile>(service.create(userId, profile), HttpStatus.CREATED);
    }
    @GetMapping("/{profileId}")
    public ResponseEntity<Profile> getById(@PathVariable("userId") Integer userId,
                                           @PathVariable("profileId") Integer profileId){
        return new ResponseEntity<Profile>(service.getByUserIdAndProfileId(userId, profileId), HttpStatus.OK);
    }
}