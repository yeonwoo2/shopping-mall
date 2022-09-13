package com.example.maninstore.dto;

import lombok.Data;

@Data
public class JoinRequestDto {

    private String username;
    private String password;
    private String role;
}
