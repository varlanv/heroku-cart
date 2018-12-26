package com.cvproject.herokushop.controllers;

import com.cvproject.herokushop.model.entity.Product;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cart")
@SessionAttributes
public class CartController {

    @PostMapping("/add")
    public void addToCart(@RequestBody Product prod, HttpSession session) {
        List<Product> products = (ArrayList<Product>) session.getAttribute("cart");

        products.add(prod);
    }

    @GetMapping("/get")
    public List<Product> getCart(HttpSession session){
        return (List<Product>) session.getAttribute("cart");
    }
}
