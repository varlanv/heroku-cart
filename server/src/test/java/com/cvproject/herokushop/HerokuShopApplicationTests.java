package com.cvproject.herokushop;

import com.cvproject.herokushop.model.entity.Product;
import com.cvproject.herokushop.model.jpaspecification.SpecTest;
import com.cvproject.herokushop.model.repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HerokuShopApplicationTests {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    EntityManager em;

    @Test
    public void contextLoads() {
//        CriteriaBuilder builder = em.getCriteriaBuilder();
//        CriteriaQuery<Product> criteria = builder.createQuery(Product.class);
//        Root<Product> root = criteria.from(Product.class);
//
//        criteria.where(builder.equal(root.get("name"), "Cheese"));
//
//        TypedQuery<Product> query = em.createQuery(criteria);
//        List<Product> resultList = query.getResultList();

        Product product = new Product();
        product.setCountry("China");
        product.setName("Cheese");

        SpecTest test = new SpecTest(product);

        System.out.println(productRepository.findAll(test));

    }
}

