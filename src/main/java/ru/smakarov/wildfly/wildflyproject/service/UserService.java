package ru.smakarov.wildfly.wildflyproject.service;

import ru.smakarov.wildfly.wildflyproject.controller.rest.UserDto;

public interface UserService {
    UserDto save(UserDto user);
}
