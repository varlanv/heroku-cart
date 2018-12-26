package com.cvproject.herokushop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private final HandlerInterceptor cartFilter;

    @Autowired
    public WebMvcConfig(HandlerInterceptor cartFilter) {
        this.cartFilter = cartFilter;
    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/public/static/");
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(cartFilter).addPathPatterns("/**");
    }


}
