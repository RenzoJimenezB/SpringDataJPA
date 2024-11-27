package pe.edu.tecsup.springdatajpa.services;

import pe.edu.tecsup.springdatajpa.entities.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();
}
