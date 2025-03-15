package com.example.honors_spring_devops.services;

import com.example.honors_spring_devops.dto.UserInfo;
import com.example.honors_spring_devops.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// @Service is also same as @Component
@Service
public class UserService {
    @Autowired
    UserInfoRepository userInfoRepository;

    public List<UserInfo> getAllUsers() {
        return userInfoRepository.getAllUsers();
    }

    public UserInfo createUser(UserInfo userInfo) {
        return userInfoRepository.createUser(userInfo);
    }

    public UserInfo getUser(String id) throws Exception {
        UserInfo userInfo = userInfoRepository.getUserById(id);
        if(userInfo != null) {
            return userInfo;
        }
        else {
            throw new Exception("User does not exist");
        }
    }
}
