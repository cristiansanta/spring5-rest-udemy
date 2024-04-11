package com.globant.proyecto8springstarterproject.repositories;

import com.globant.proyecto8springstarterproject.entities.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
}