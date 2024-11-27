package pe.edu.tecsup.springdatajpa.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.edu.tecsup.springdatajpa.entities.Role;
import pe.edu.tecsup.springdatajpa.repositories.RoleRepository;

import java.util.List;

@Slf4j
@Service
public class RoleServiceImpl implements RoleService {

    RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findAll() {
        log.info("RoleServiceImpl.findAll()");

        return roleRepository.findAll();
    }
}
