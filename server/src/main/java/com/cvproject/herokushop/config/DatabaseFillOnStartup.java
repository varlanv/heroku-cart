package com.cvproject.herokushop.config;

import com.cvproject.herokushop.auth.Role;
import com.cvproject.herokushop.auth.Roles;
import com.cvproject.herokushop.model.entity.Product;
import com.cvproject.herokushop.model.repository.ProductRepository;
import com.cvproject.herokushop.model.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

@Component
public class DatabaseFillOnStartup implements CommandLineRunner {
    private final ProductRepository productRepository;
    private final RoleRepository roleRepository;

    private Set<Role> getRolesList() {
        Set<Role> roles = new HashSet<>();
        for (Roles roleEnum : Roles.values()) {
            Role role = new Role(roleEnum.toString());
            roles.add(role);
        }
        return roles;
    }

    @Autowired
    public DatabaseFillOnStartup(ProductRepository productRepo, RoleRepository roleRepo) {
        this.productRepository = productRepo;
        this.roleRepository = roleRepo;

    }

    @Override
    public void run(String... args) {
        roleRepository.saveAll(getRolesList());

        productRepository.saveAll(hardcodedProductList());
    }

    private List<Product> hardcodedProductList() {
        List<Product> products = new ArrayList<>();

        Stream.of(
                new Product("Cheese", "Ukraine", "RoofsAndHoofs", "/img/cheese.png"),
                new Product("Tea", "England", "Greenfield", "/img/tea.png"),
                new Product("Phone", "China", "Apple", "/img/phone.png"),
                new Product("Laptop", "USA", "Dell", "/img/laptop.png"),
                new Product("Tablet", "USA", "Asus", "/img/tablet.png"),
                new Product("Cheese", "China", "Lenovo", "/img/cheese.png"),
                new Product("Laptop", "China", "Lenovo", "/img/laptop.png"),
                new Product("Headphones", "Switzerland", "Logitech", "/img/headphones.png"),
                new Product("Laptop", "China", "Acer", "/img/laptop.png"),
                new Product("Tablet", "China", "Asus", "/img/tablet.png"),
                new Product("Cheese", "Italy", "HoofsAndRoofs", "/img/cheese.png"),
                new Product("Phone", "Finland", "Nokia", "/img/phone.png"),
                new Product("Phone", "Korea", "Samsung", "/img/phone.png"),
                new Product("Laptop", "China", "Lenovo", "/img/laptop.png")
        ).forEach(products::add);

        return products;
    }
}

