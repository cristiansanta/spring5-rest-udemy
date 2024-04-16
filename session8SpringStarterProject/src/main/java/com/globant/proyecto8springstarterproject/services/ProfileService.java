package com.globant.proyecto8springstarterproject.services;

import com.globant.proyecto8springstarterproject.entities.Profile;
import com.globant.proyecto8springstarterproject.entities.User;
import com.globant.proyecto8springstarterproject.repositories.ProfileRespository;
import com.globant.proyecto8springstarterproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    private ProfileRespository profileRespository;
    @Autowired
    private UserRepository userRepository;
    public Profile create(Integer userId, Profile profile){
        Optional<User> result = userRepository.findById(userId);
        if (result.isPresent()){
            profile.setUser(result.get());
            return profileRespository.save(profile);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("User %d not found", userId));
        }
    }
    public Profile getByUserIdAndProfileId(Integer userId, Integer profileId){
        return profileRespository.findByUserIdAndProfileId(userId, profileId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                String.format("Profile not found for user %d and profile %d", userId, profileId)));
    }
}
