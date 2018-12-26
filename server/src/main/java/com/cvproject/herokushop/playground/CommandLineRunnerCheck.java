package com.cvproject.herokushop.playground;

import com.cvproject.herokushop.model.entity.Product;
import com.cvproject.herokushop.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class CommandLineRunnerCheck implements CommandLineRunner {

    private final ProductRepository repo;

    @Autowired
    public CommandLineRunnerCheck(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        Product product1 = new Product("Cheese", "Ukraine", "RoofsAndHoofs", "https://picsum.photos/200/200/?random");
        Product product2 = new Product("Tea", "England", "Greenfield", "https://picsum.photos/201/201/?random");
        Product product3 = new Product("Phone", "China", "Apple", "https://picsum.photos/202/202/?random");
        Product product4 = new Product("Notebook", "USA", "Dell", "https://picsum.photos/203/203/?random");
        Product product5 = new Product("Tablet", "USA", "Asus", "https://picsum.photos/204/204/?random");
        Product product6 = new Product("Notebook", "China", "Lenovo", "https://picsum.photos/205/205/?random");

        Stream.of(product1, product2, product3, product4, product5, product6).forEach(repo::save);
    }
}
