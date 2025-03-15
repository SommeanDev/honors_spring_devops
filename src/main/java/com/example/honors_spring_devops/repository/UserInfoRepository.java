package com.example.honors_spring_devops.repository;

import com.example.honors_spring_devops.dto.UserInfo;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class UserInfoRepository {
    Map<String, UserInfo> userInfoTable;

    @PostConstruct
    public void init() {
        userInfoTable = new HashMap<>();
    }

    public List<UserInfo> getAllUsers() {
        return new ArrayList<>(userInfoTable.values());
    }

    public UserInfo createUser(UserInfo userInfo) {
        String userId = UUID.randomUUID().toString();
        UserInfo userWithId = userInfo.toBuilder().id(userId).build(); // Create a new instance with ID
        this.userInfoTable.put(userId, userWithId); // Store the correct object
        return userWithId; // Return the stored user
    }

    public UserInfo getUserById(String id) {
        return userInfoTable.get(id);
    }
}
