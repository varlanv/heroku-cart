package com.cvproject.herokushop.model.repository;

import com.cvproject.herokushop.model.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Collection<Product> findAllByName(String name);

    Collection<Product> findAllByCountry(String country);

    Collection<Product> findAllByManufacturer(String manufacturer);
}
