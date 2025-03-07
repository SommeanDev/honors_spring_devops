package com.example.honors_spring_devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/")
    List<String> getAllUsers(){
        return List.of("user1", "user2");
    }

    @PostMapping()
    void CreateUser() {
        System.out.println("User Created");
    }
}
