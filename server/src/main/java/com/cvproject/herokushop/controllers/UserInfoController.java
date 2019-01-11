package com.cvproject.herokushop.controllers;

import com.cvproject.herokushop.auth.CustomUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
    @GetMapping("/user-info")
    public String getUserInfo() {
        try {
            CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

            return userDetails.getUsername();
        } catch (Exception e) { /*nop*/}
        return "Anonymous";
    }
}
