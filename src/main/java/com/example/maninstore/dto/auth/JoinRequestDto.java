package com.example.maninstore.dto.auth;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class JoinRequestDto {

    @NotBlank(message = "아이디를 입력해주세요")
    private String username;

    @NotBlank(message = "비밀번호를 입력해주세요")
    private String password;

    @NotBlank(message = "이름을 입력해주세요")
    private String name;

    @NotBlank(message = "전화번호를 입력해주세요")
    private String phone;

    @NotNull
    private String role;
}
