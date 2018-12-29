package com.cvproject.herokushop.controllers;

import com.cvproject.herokushop.auth.User;
import com.cvproject.herokushop.auth.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
    @Autowired
    UserService userService;
    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/registration")
    public String showRegistrationForm() {
        return "signup-page";
    }

    @PostMapping(value = "/registration-proceed", produces = "text/html ")
    public String register(@ModelAttribute User user, ModelAndView modelAndView) {
        System.out.println(user);
        System.out.println(user);

        if (!user.getPassword().equals(user.getPasswordConfirm())) {
            return "redirect:/error";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.saveUser(user);

        System.out.println(userService.loadUserByUsername(user.getUsername()));
        System.out.println(userService.loadUserByUsername(user.getUsername()).getPassword());
        return "redirect:/";
    }


}
