package com.example.maninstore.controller;

import com.example.maninstore.dto.auth.JoinRequestDto;
import com.example.maninstore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TestController {

    private final UserService userService;

    // 모든 사람이 접근 가능
    @GetMapping("home")
    public String home() {
        return "<h1>home</h1>";
    }

    // Tip : JWT를 사용하면 UserDetailsService를 호출하지 않기 때문에 @AuthenticationPrincipal 사용
    // 불가능.
    // 왜냐하면 @AuthenticationPrincipal은 UserDetailsService에서 리턴될 때 만들어지기 때문이다.

    // 매니저 혹은 어드민이 접근 가능
    @GetMapping("manager/reports")
    public String reports() {
        return "<h1>reports</h1>";
    }

    // 어드민이 접근 가능
//    @GetMapping("admin/users")
//    public List<User> users() {
//        return userRepository.findAll();
//    }

    @PostMapping("join")
    public String join(@RequestBody JoinRequestDto joinRequestDto) {
        userService.Join(joinRequestDto);
        return "회원가입완료";
    }

    //user, manager, admin 접근가능
    @GetMapping("/user")
    public String user(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserDetails userDetails = (UserDetails)principal;

        String username = ((UserDetails) principal).getUsername();
        return "user====" + username;
    }

//    //manager, admin 접근가능
//    @GetMapping("/manager")
//    public String manager(){
//        return "manager";
//    }
//
//    //admin 접근가능
//    @GetMapping("/admin")
//    public String admin(){
//        return "admin";
//    }
}
