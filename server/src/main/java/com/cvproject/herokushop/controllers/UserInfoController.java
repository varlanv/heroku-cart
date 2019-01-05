package com.cvproject.herokushop.controllers;

import com.cvproject.herokushop.auth.CustomUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
    @GetMapping("/user-info")
    public String getUserInfo() {
//        CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());

        try {
            CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            System.out.println(userDetails.getUsername());
            System.out.println(userDetails.getUsername());
            System.out.println(userDetails.getUsername());
            System.out.println(userDetails.getUsername());
            System.out.println(userDetails.getUsername());
            System.out.println(userDetails.getUsername());
            System.out.println(userDetails.getUsername());
            System.out.println(userDetails.getUsername());
            System.out.println(userDetails.getUsername());
            return userDetails.getUsername();
        } catch (Exception e) {
        }

        return "kek";
//        return userDetails.getUsername() == null ? "testq" : userDetails.getUsername();
    }
}
