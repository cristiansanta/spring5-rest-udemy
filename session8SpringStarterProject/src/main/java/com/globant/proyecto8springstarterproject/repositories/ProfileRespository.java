package com.globant.proyecto8springstarterproject.repositories;

import com.globant.proyecto8springstarterproject.entities.Profile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfileRespository extends CrudRepository<Profile, Integer> {
    @Query("SELECT p FROM Profile p WHERE p.user.id=?1 AND p.id=?2")
    Optional <Profile> findByUserIdAndProfileId(Integer userId, Integer profileId);
}