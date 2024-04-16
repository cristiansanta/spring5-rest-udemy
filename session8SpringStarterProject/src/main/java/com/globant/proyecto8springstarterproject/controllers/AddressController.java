package com.globant.proyecto8springstarterproject.controllers;

import java.util.List;
import com.globant.proyecto8springstarterproject.entities.Address;
import com.globant.proyecto8springstarterproject.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/{userId}/profiles/{profileId}/addresses")
public class AddressController {
    @Autowired
    private AddressService addressService;
    @GetMapping
    public ResponseEntity<List<Address>> findAddressesByProfileAndUserId(@PathVariable("userId") Integer userId,
                                                                          @PathVariable("profileId") Integer profileId){
        return new ResponseEntity<List<Address>>(addressService.findAddressesByProfileAndUserId(userId,profileId), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Address> create(@PathVariable("userId") Integer userId,
                                          @PathVariable("profileId") Integer profileId, @RequestBody Address address){
        return new ResponseEntity<Address>(addressService.createAddress(userId,profileId,address),HttpStatus.CREATED);
    }
}