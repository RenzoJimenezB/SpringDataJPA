package pe.edu.tecsup.springdatajpa.services;

import pe.edu.tecsup.springdatajpa.entities.User;

import java.util.List;

public interface UserService {
    void save(User user);

    List<User> findAll();

    List<User> findByName(String name);

    User findById(Long id) throws Exception;

    void deleteById(Long id);

    void update(User user);
}
