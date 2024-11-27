package pe.edu.tecsup.springdatajpa.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.edu.tecsup.springdatajpa.entities.User;
import pe.edu.tecsup.springdatajpa.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        log.info("UserServiceImpl.save()");

        userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        log.info("UserServiceImpl.findAll()");

        return userRepository.findAll();
    }

    @Override
    public List<User> findByName(String name) {
        log.info("UserServiceImpl.findByName()");

        return userRepository.findByName(name);
    }

    @Override
    public User findById(Long id) throws Exception {
        log.info("UserServiceImpl.findById()");

        Optional<User> user = userRepository.findById(id);

        if (user.isPresent())
            return user.get();
        else
            throw new Exception("User not found");
    }

    @Override
    public void update(User user) {
        log.info("UserServiceImpl.update()");

        userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        log.info("UserServiceImpl.deleteById()");

        userRepository.deleteById(id);
    }
}
