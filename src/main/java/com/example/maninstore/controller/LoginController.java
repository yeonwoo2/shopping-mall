package com.example.maninstore.controller;

import com.example.maninstore.dto.ResponseDto;
import com.example.maninstore.dto.auth.CheckUsernameDto;
import com.example.maninstore.dto.auth.JoinRequestDto;
import com.example.maninstore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
public class LoginController {

    private final UserService userService;

    @PostMapping("join")
    public ResponseDto<String> join(@RequestBody @Valid JoinRequestDto joinRequestDto) {
        userService.Join(joinRequestDto);
        return new ResponseDto<>(HttpStatus.OK.value(), "회원가입이 완료되었습니다");
    }

    @GetMapping("check-join")
    public ResponseDto<String> validJoin(@RequestBody CheckUsernameDto checkUsernameDto){
        String message = userService.validJoin(checkUsernameDto);
        return new ResponseDto<>(HttpStatus.OK.value(), message);
    }
}
