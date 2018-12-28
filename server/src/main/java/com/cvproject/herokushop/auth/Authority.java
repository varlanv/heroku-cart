package com.cvproject.herokushop.auth;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Authority {

    @Id
    @GeneratedValue()
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "authorities")
    private Collection<Role> roles;
}
