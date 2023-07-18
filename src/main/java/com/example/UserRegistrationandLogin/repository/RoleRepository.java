package com.example.UserRegistrationandLogin.repository;

import com.example.UserRegistrationandLogin.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}