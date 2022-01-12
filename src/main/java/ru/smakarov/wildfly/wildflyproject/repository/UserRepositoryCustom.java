package ru.smakarov.wildfly.wildflyproject.repository;


import ru.smakarov.wildfly.wildflyproject.entity.User;

import java.sql.SQLException;
import java.util.Optional;

public interface UserRepositoryCustom {

    Optional<User> nativeUpdate(User user) throws SQLException;

}
