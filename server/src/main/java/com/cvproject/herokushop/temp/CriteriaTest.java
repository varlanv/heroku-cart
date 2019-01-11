package com.cvproject.herokushop.temp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

@Repository
public class CriteriaTest {
    private final EntityManager manager;

    @Autowired
    public CriteriaTest(EntityManager manager) {
        this.manager = manager;
    }

    void criteriaBuilder() {
        CriteriaBuilder cb = manager.getCriteriaBuilder();

    }
}
