package com.example.ecommerce.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.User;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        // Your login logic here
        return "Login successful";
    }
}
