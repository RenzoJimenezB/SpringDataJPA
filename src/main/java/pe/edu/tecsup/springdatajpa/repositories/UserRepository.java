package pe.edu.tecsup.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.tecsup.springdatajpa.entities.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByName(String name);
}
