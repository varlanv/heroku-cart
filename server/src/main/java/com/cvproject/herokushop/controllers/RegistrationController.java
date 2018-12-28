package com.cvproject.herokushop.controllers;

import com.cvproject.herokushop.auth.User;
import com.cvproject.herokushop.auth.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.RequestToViewNameTranslator;

@Controller
public class RegistrationController {

    @Autowired
    UserService userService;

    @GetMapping("/registration")
    public String showRegistrationForm() {
        return "signup-page";
    }

    @PostMapping(value = "/registration", produces = "text/html ")
    public String register(@ModelAttribute User user, ModelAndView modelAndView) {
        System.out.println(user);
        System.out.println(user);
        userService.saveUser(user);


        System.out.println(userService.loadUserByUsername(user.getUsername()));
        System.out.println(userService.loadUserByUsername(user.getUsername()));
        System.out.println(userService.loadUserByUsername(user.getUsername()).getPassword());
        return "redirect:/index.html";
    }



}
