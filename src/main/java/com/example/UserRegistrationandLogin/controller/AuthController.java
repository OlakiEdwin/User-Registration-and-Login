package com.example.UserRegistrationandLogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class AuthController {

    @GetMapping("/index")
    public String home() {
        return "index";
    }
}
