package com.globant.proyecto8springstarterproject.repositories;

import com.globant.proyecto8springstarterproject.entities.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRespository extends CrudRepository<Profile, Integer> {
}