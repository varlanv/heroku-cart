package com.cvproject.herokushop.controllers;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

//    @GetMapping("/login")
//    public String doGet() {
//        return "loginpage";
//    }
    @GetMapping("/registration")
    public String doGetSign() {
        return "signup-page";
    }

    @GetMapping("/loginvalidation")
    public String loginValidation(@RequestBody SecurityProperties.User user) {


        return "index";
    }
}
