package com.cvproject.herokushop.playground;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RandomController {

    @GetMapping("/admin")
    public String doGet() {
        return "admin";
    }
}
