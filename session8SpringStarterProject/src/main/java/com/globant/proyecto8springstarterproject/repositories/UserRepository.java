package com.globant.proyecto8springstarterproject.repositories;

import com.globant.proyecto8springstarterproject.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    public Optional<User> findByUsername(String username);
    public Optional<User> findByUsernameAndPassword(String username, String password);
    //Esto no es SQL se llama JPQL=java persistence query language
    @Query("SELECT u.username FROM User u WHERE u.username like '%douglas'")
    public Page<String> findUsernames(Pageable pageable);
}
