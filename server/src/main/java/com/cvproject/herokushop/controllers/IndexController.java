package com.cvproject.herokushop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @GetMapping("/")
    public String doGet() {
        return "index";
    }
}