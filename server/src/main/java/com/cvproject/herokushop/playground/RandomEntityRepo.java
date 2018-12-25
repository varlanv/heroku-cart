package com.cvproject.herokushop.playground;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

interface RandomEntityRepo extends CrudRepository<RandomEntity, Long> {
    List<RandomEntity> findByLastName(String lastName);
}