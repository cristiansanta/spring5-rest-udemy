package com.globant.proyecto8springstarterproject.services;

import com.globant.proyecto8springstarterproject.entities.Role;
import com.globant.proyecto8springstarterproject.entities.User;
import com.globant.proyecto8springstarterproject.repositories.RoleRepository;
import com.globant.proyecto8springstarterproject.repositories.UserInRoleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RoleRepository repository;
    @Autowired
    private UserInRoleRespository userInRoleRespository;
    public List<User> getUsersByRole(String roleName){
            return userInRoleRespository.findUsersByRoleName(roleName);
    }
    public List<Role> getRoles(){
        return repository.findAll();
    }
    public Role createRole(Role role){
        return repository.save(role);
    }
    public Role updateRole(Integer roleId, Role role){
        Optional<Role> result = repository.findById(roleId);
        if(result.isPresent()){
            return repository.save(role);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Role id %d doesn't exists", roleId));
        }
    }

    public void deleteRole(Integer roleId) {
        Optional<Role> result = repository.findById(roleId);
        if(result.isPresent()){
            repository.delete(result.get());
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Role id %d doesn´t exist", roleId));
        }
    }
}