package com.globant.proyecto8springstarterproject.services;

import com.globant.proyecto8springstarterproject.entities.Address;
import com.globant.proyecto8springstarterproject.entities.Profile;
import com.globant.proyecto8springstarterproject.repositories.AddressRepository;
import com.globant.proyecto8springstarterproject.repositories.ProfileRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ProfileRespository profileRespository;

    public List<Address> findAddressesByProfileAndUserId(Integer userId, Integer profileId) {
        return addressRepository.findByProfileId(userId, profileId);
    }
    public Address createAddress(Integer userId, Integer profileId, Address address){
        Optional<Profile> result = profileRespository.findByUserIdAndProfileId(userId, profileId);
        if(result.isPresent()){
            address.setProfile(result.get());
            return addressRepository.save(address);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    String.format("Profile %d and User %d not found", profileId, userId));
        }
    }
}