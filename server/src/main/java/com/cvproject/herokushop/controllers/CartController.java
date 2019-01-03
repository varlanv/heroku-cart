package com.cvproject.herokushop.controllers;

import com.cvproject.herokushop.model.entity.Product;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/cart")
public class CartController {

    @PostMapping("/add")
    public void addToCart(@RequestBody Product prod, HttpSession session) {
        Map<Long, Product> products = (Map<Long, Product>) session.getAttribute("cart");
        if (products.containsKey(prod.getId())) {
            Product product = products.get(prod.getId());
            product.setAmountInCart(product.getAmountInCart() + 1);
        } else {
            prod.setAmountInCart(1);
            products.put(prod.getId(), prod);
        }
    }

    @GetMapping("/get")
    public Set<Product> getCart(HttpSession session) {
        Map<Long, Product> products = (Map<Long, Product>) session.getAttribute("cart");

        return new HashSet<>(products.values());
    }


    @DeleteMapping("/remove/{prodId}")
    public Set<Product> removeFromCart(@PathVariable("prodId") Long prodId, HttpSession session) {
        Map<Long, Product> products = (Map<Long, Product>) session.getAttribute("cart");
        products.remove(prodId);

        return new HashSet<>(products.values());
    }


    @PostMapping("/add-one")
    public Set<Product> addOneToCart(@RequestBody Product prod, HttpSession session) {
        Map<Long, Product> products = (Map<Long, Product>) session.getAttribute("cart");
        if (products.containsKey(prod.getId())) {
            Product product = products.get(prod.getId());
            product.setAmountInCart(product.getAmountInCart() + 1);
        } else {
            prod.setAmountInCart(1);
            products.put(prod.getId(), prod);
        }
        return new HashSet<>(products.values());
    }



    @DeleteMapping("/remove-one/{prodId}")
    public Set<Product> removeOneFromCart(@PathVariable("prodId") Long prodId, HttpSession session) {
        Map<Long, Product> products = (Map<Long, Product>) session.getAttribute("cart");
        Product product = products.get(prodId);
        if (product.getAmountInCart() == 1) {
            products.remove(product.getId());
        } else {
            product.setAmountInCart(product.getAmountInCart() - 1);
        }
        return new HashSet<>(products.values());

    }


}
