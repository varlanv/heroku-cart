package com.cvproject.herokushop.model.repository;

import com.cvproject.herokushop.auth.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, String> {
}
