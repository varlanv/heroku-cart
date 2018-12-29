package com.cvproject.herokushop.config;

import com.cvproject.herokushop.auth.*;
import com.cvproject.herokushop.model.entity.Product;
import com.cvproject.herokushop.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

@Component
public class DatabaseFillOnStartup implements CommandLineRunner {
    private final ProductRepository productRepository;
    private final RoleRepository roleRepository;
    private final AuthorityRepository authorityRepository;
    private final UserRepository userRepository;

    private Set<Role> getRolesList() {
        Set<Role> roles = new HashSet<>();
        for (Roles roleEnum : Roles.values()) {
            Role role = new Role(roleEnum.toString());
            roles.add(role);
        }
        return roles;
    }

    @Autowired
    public DatabaseFillOnStartup(ProductRepository productRepo, RoleRepository roleRepo, AuthorityRepository authorityRepo, UserRepository repository, UserRepository userRepository) {
        this.productRepository = productRepo;
        this.roleRepository = roleRepo;
        this.authorityRepository = authorityRepo;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        roleRepository.saveAll(this.getRolesList());

        User user = new User();
        user.setUsername("user");
        user.setPassword("password");

        userRepository.save(user);

        Product product1 = new Product("Cheese", "Ukraine", "RoofsAndHoofs", "https://picsum.photos/200/200/?random");
        Product product2 = new Product("Tea", "England", "Greenfield", "https://picsum.photos/201/201/?random");
        Product product3 = new Product("Phone", "China", "Apple", "https://picsum.photos/202/202/?random");
        Product product4 = new Product("Notebook", "USA", "Dell", "https://picsum.photos/203/203/?random");
        Product product5 = new Product("Tablet", "USA", "Asus", "https://picsum.photos/204/204/?random");
        Product product6 = new Product("Notebook", "China", "Lenovo", "https://picsum.photos/205/205/?random");

        Stream.of(product1, product2, product3, product4, product5, product6).forEach(productRepository::save);
    }
}
