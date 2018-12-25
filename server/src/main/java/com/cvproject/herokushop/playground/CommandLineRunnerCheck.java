package com.cvproject.herokushop.playground;

import com.cvproject.herokushop.model.entity.Product;
import com.cvproject.herokushop.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class CommandLineRunnerCheck implements CommandLineRunner {

    @Autowired
    private final ProductRepository repo;

    public CommandLineRunnerCheck(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        Product product1 = new Product("Cheese", "Ukraine", "RoofsAndHoofs");
        Product product2 = new Product("Tea", "England", "Greenfield");
        Product product3 = new Product("Phone", "China", "Lemon");
        Product product4 = new Product("Notebook", "USA", "Dell");

        Stream.of(product1, product2, product3, product4).forEach(repo::save);
    }
}
