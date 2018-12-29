package com.cvproject.herokushop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageController {
    @GetMapping("/admin")
    public String doGet() {
        return "admin";
    }
}
