package com.cvproject.herokushop.config;

import com.cvproject.herokushop.auth.Role;
import com.cvproject.herokushop.auth.Roles;
import com.cvproject.herokushop.model.entity.Product;
import com.cvproject.herokushop.model.repository.AuthorityRepository;
import com.cvproject.herokushop.model.repository.ProductRepository;
import com.cvproject.herokushop.model.repository.RoleRepository;
import com.cvproject.herokushop.model.repository.UserRepository;
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
        roleRepository.saveAll(getRolesList());

        productRepository.saveAll(hardcodedProductList());
    }

    private List<Product>hardcodedProductList() {
        List<Product> products = new ArrayList<>();
        Stream.of(
                new Product("Cheese", "Ukraine", "RoofsAndHoofs", "https://picsum.photos/200/200/?random"),
                new Product("Tea", "England", "Greenfield", "https://picsum.photos/201/201/?random"),
                new Product("Phone", "China", "Apple", "https://picsum.photos/202/202/?random"),
                new Product("Notebook", "USA", "Dell", "https://picsum.photos/203/203/?random"),
                new Product("Tablet", "USA", "Asus", "https://picsum.photos/204/204/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/205/205/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/206/206/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/207/207/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/208/208/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/209/209/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/210/210/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/211/211/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/212/212/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/213/213/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/214/214/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/215/215/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/216/216/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/218/218/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/219/219/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/220/220/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/221/221/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/222/222/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/223/223/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/224/224/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/225/225/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/226/226/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/227/227/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/228/228/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/229/229/?random"),
                new Product("Notebook", "China", "Lenovo", "https://picsum.photos/230/230/?random"))
                .forEach(products::add);

        return products;
    }
}

