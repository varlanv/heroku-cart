package com.cvproject.herokushop.model.repository;

import com.cvproject.herokushop.model.entity.Product;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.Collection;

public interface ProductRepository extends CrudRepository<Product, Long>, JpaSpecificationExecutor<Product> {
}
