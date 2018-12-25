package com.cvproject.herokushop.model.repository;

import com.cvproject.herokushop.model.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
