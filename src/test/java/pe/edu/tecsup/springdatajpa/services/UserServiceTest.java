package pe.edu.tecsup.springdatajpa.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void save() {
        log.info("Testing UserService.save()");
    }

    @Test
    void findAll() {
        log.info("Testing UserService.findAll()");
    }

    @Test
    void findByName() {
        log.info("Testing UserService.findByName()");
    }

    @Test
    void findById() {
        log.info("Testing UserService.findById()");
    }

    @Test
    void deleteById() {
        log.info("Testing UserService.deleteById()");
    }

    @Test
    void update() {
        log.info("Testing UserService.update()");
    }
}