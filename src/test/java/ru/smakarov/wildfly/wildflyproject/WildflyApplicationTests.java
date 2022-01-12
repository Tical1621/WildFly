package ru.smakarov.wildfly.wildflyproject;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.smakarov.wildfly.wildflyproject.config.AppConfig;
import ru.smakarov.wildfly.wildflyproject.entity.User;
import ru.smakarov.wildfly.wildflyproject.repository.UserRepository;
import ru.smakarov.wildfly.wildflyproject.repository.UserRepositoryCustom;

@Disabled
@SpringBootTest
class WildflyApplicationTests {

    @Autowired
    AppConfig appConfig;


    @Test
    void contextLoads() {
    }

    @Test
    void insert() {
        User expectedUser = new User();
    }


}
