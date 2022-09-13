package com.example.maninstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
