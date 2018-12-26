package com.cvproject.herokushop.controllers;

import com.cvproject.herokushop.model.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @PostMapping("/add")
    public void addToCart(@RequestBody Product prod, HttpSession session) {

        session.setAttribute(prod.getId().toString(), prod);
    }

    @ResponseBody
    @GetMapping("/get")
    public List<Product> getCart(HttpSession session){
        Enumeration<String> attributeNames = session.getAttributeNames();

        List<Product> products = new ArrayList<>();
        while (attributeNames.hasMoreElements()) {
            Product prod = (Product) session.getAttribute(attributeNames.nextElement());
            products.add(prod);
            System.out.println(prod);
        }

        return products;
    }
}
