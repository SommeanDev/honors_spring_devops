package com.example.honors_spring_devops.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder (toBuilder = true)
@AllArgsConstructor // Required for Jackson deserialization
@NoArgsConstructor
public class UserInfo {
    private String id;
    private String name;
    private String email;
    private  String address;
    private  String phone;
}
