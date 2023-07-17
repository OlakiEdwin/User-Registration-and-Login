package com.example.UserRegistrationandLogin.service;

import net.javaguides.springboot.dto.UserDto;
import net.javaguides.springboot.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(USerDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
