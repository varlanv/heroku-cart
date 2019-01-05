package com.cvproject.herokushop.model.entity;

public class UserInfo {
    private final User user;

    UserInfo(User user) {
        this.user = user;
    }

    private String username;
    
    public String getUsername() {
        return user.getUsername();
    }
}
