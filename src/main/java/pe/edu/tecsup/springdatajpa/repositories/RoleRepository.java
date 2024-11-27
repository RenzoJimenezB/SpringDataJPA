package pe.edu.tecsup.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.tecsup.springdatajpa.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
