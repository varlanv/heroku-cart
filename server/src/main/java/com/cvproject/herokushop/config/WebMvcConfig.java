package com.cvproject.herokushop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private final
    HandlerInterceptor yourInjectedInterceptor;

    @Autowired
    public WebMvcConfig(HandlerInterceptor yourInjectedInterceptor) {
        this.yourInjectedInterceptor = yourInjectedInterceptor;
    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("loginpage");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/public/static/");
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(yourInjectedInterceptor).addPathPatterns("/qqweae");
    }


}
