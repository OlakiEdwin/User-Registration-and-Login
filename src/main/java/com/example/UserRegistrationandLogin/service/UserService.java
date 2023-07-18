package com.example.UserRegistrationandLogin.service;

import com.example.UserRegistrationandLogin.dto.UserDto;
import com.example.UserRegistrationandLogin.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}