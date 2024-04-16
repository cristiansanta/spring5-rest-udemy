package com.globant.proyecto8springstarterproject.config;

import com.globant.proyecto8springstarterproject.entities.User;
import com.globant.proyecto8springstarterproject.entities.UserInRole;
import com.globant.proyecto8springstarterproject.repositories.UserInRoleRespository;
import com.globant.proyecto8springstarterproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CR7UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserInRoleRespository userInRoleRespository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optional = userRepository.findByUsername(username);
        if (optional.isPresent()) {
            User user = optional.get();
            List<UserInRole> userInRoles = userInRoleRespository.findByUser(user);
            String[] roles = userInRoles.stream().map(r -> r.getRole().getName()).toArray(String[]::new);
            return org.springframework.security.core.userdetails.User.withUsername(user.getUsername())
                    .password(passwordEncoder.encode(user.getPassword()))
                    .roles(roles)
                    .build();
        } else {
            throw new UsernameNotFoundException("Username " + username + " not found");
        }
    }
}