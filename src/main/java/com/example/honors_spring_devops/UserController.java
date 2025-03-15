package com.example.honors_spring_devops;

import com.example.honors_spring_devops.dto.UserInfo;
import com.example.honors_spring_devops.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    List<UserInfo> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping()
    UserInfo CreateUser(@RequestBody UserInfo userInfo) {
        return userService.createUser(userInfo);
    }

    @GetMapping("/{id}")
    ResponseEntity<UserInfo> getUserById(@PathVariable String id) {
        try {
            return ResponseEntity.ok().body(userService.getUser(id));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
