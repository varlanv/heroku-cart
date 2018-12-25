package com.cvproject.herokushop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private final
    HandlerInterceptor yourInjectedInterceptor;

    @Autowired
    public WebMvcConfig(HandlerInterceptor yourInjectedInterceptor) {
        this.yourInjectedInterceptor = yourInjectedInterceptor;
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(yourInjectedInterceptor).addPathPatterns("/qqweae");
    }


}
