package com.cvproject.herokushop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String doGet() {
        return "loginpage";
    }
    @GetMapping("/signup")
    public String doGetSign() {
        return "signup-page";
    }
}
