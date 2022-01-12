package ru.smakarov.wildfly.wildflyproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.smakarov.wildfly.wildflyproject.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
