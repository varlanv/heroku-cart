package com.cvproject.herokushop.controllers;

import com.cvproject.herokushop.auth.User;
import com.cvproject.herokushop.auth.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

    @Autowired
    UserService userService;

    @GetMapping("/registration")
    public String showRegistrationForm() {
        return "signup-page";
    }

    @PostMapping(value = "/registration-proceed", produces = "text/html ")
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
