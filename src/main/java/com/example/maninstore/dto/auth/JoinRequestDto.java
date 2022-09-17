package com.example.maninstore.dto.auth;

import lombok.Data;

@Data
public class JoinRequestDto {

    private String username;
    private String password;
    private String name;
    private String phone;
    private String role;
}