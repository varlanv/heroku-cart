package com.cvproject.herokushop.controllers.filters;

import com.cvproject.herokushop.model.entity.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Enumeration;

@Component
public class CartFilter implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        HttpSession session = request.getSession();
        if (session.isNew()) {

            System.out.println(session.getId());
            System.out.println(session.getId());
            System.out.println(session.getId());

            Enumeration<String> attributeNames = session.getAttributeNames();
            while (attributeNames.hasMoreElements()) {
                String str = attributeNames.nextElement();

                System.out.println(str);
                System.out.println(str);
                System.out.println(str);

            }

            session.setAttribute("cart", new ArrayList<Product>());
        }

        return true;
    }
}
