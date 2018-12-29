package com.cvproject.herokushop.playground;

import com.cvproject.herokushop.model.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TestHtmlController {

    @PostMapping("/test")
    public void post(@RequestBody Product prod) {
        System.out.println(prod);
        System.out.println(prod);
        System.out.println(prod);
        System.out.println(prod);
        System.out.println(prod);
        System.out.println(prod);
    }
}
