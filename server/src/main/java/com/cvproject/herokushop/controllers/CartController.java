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
        prod.setAmountInCart(prod.getAmountInCart() + 1);
        products.put(prod.getId(), prod);
    }

    @GetMapping("/get")
    public Set<Product> getCart(HttpSession session) {
        Map<Long, Product> products = (Map<Long, Product>) session.getAttribute("cart");

        return new HashSet<>(products.values());
    }


    @DeleteMapping("/remove/{prodId}")
    public void removeFromCart(@PathVariable("prodId") Long prodId, HttpSession session) {
        Map<Long, Product> products = (Map<Long, Product>) session.getAttribute("cart");
        products.remove(prodId);
    }

    @DeleteMapping("/remove-one/{prodId}")
    public void removeOneFromCart(@PathVariable("prodId") Long prodId, HttpSession session) {
        Map<Long, Product> products = (Map<Long, Product>) session.getAttribute("cart");
        Product product = products.get(prodId);
        product.setAmountInCart(product.getAmountInCart() + 1);
    }


}
