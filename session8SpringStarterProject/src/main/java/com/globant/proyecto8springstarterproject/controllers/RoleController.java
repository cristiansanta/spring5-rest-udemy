package com.globant.proyecto8springstarterproject.controllers;

import com.globant.proyecto8springstarterproject.entities.Role;
import com.globant.proyecto8springstarterproject.entities.User;
import com.globant.proyecto8springstarterproject.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private RoleService service;
    @GetMapping
    public ResponseEntity<List<Role>> getRoles(){
        return new ResponseEntity<List<Role>>(service.getRoles(), HttpStatus.OK);
    }
    @GetMapping("/{roleName}/users")
    public ResponseEntity<List<User>> getUsersByRole(@PathVariable("roleName") String roleName){
        return new ResponseEntity<List<User>>(service.getUsersByRole(roleName), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Role> createRoles(@RequestBody Role role){
        return new ResponseEntity<Role>(service.createRole(role), HttpStatus.CREATED);
    }
    @PutMapping("/{roleId}")
    public ResponseEntity<Role> updateRoles(@PathVariable("roleId") Integer roleId,@RequestBody Role role){
        return new ResponseEntity<Role>(service.updateRole(roleId, role), HttpStatus.OK);
    }
    @DeleteMapping("/{roleId}")
    public ResponseEntity<Void> deleteRole(@PathVariable("roleId") Integer roleId){
        service.deleteRole(roleId);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}