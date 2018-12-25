package com.cvproject.herokushop.controllers;

import com.cvproject.herokushop.model.entity.Product;
import com.cvproject.herokushop.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api")
class ProductController {
    private final ProductRepository repository;

    @Autowired
    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/products")
    public Iterable<Product> getAll() {
        System.out.println(repository.findAll());
        return repository.findAll();
    }

    @PostMapping("/products/add")
    public Product doPost(@RequestBody Product prod) {
        return repository.save(prod);
    }

}