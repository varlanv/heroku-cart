package com.cvproject.herokushop.controllers;

import com.cvproject.herokushop.model.entity.Product;
import com.cvproject.herokushop.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        return repository.findAll();
    }

    @PostMapping("/products/add")
    public Product doPost(@RequestBody Product prod) {
        return repository.save(prod);
    }




    @GetMapping("/products/filter")
    public Iterable<Product> getAllFiltered(@ModelAttribute Product product) {
        return repository.findAll(Example.of(product));
//        return repository.findAllByName(product.getName());
    }
}