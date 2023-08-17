package com.arjun.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String printMethod(){
        return "Welcome";
    }

    @GetMapping("/user")
    public String getUser(){
        return "Welcome User";
    }

    @GetMapping("/admin")
    public String getAdmin(){
        return "Welcome Admin";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    }
