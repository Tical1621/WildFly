package ru.smakarov.wildfly.wildflyproject.controller.rest;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private int age;
}

