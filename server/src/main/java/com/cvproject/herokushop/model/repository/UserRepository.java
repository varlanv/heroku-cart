package com.cvproject.herokushop.model.repository;

import com.cvproject.herokushop.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

