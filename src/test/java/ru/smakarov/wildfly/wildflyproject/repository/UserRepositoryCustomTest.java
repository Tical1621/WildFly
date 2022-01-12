package ru.smakarov.wildfly.wildflyproject.repository;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.smakarov.wildfly.wildflyproject.entity.User;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootApplication
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void insert() {
        User expectedUser = new User();
        User savedUser = userRepository.save(expectedUser);
        User actualUser = userRepository.getById(savedUser.getId());
        assertEquals(expectedUser.getName(), actualUser.getName());
    }
}