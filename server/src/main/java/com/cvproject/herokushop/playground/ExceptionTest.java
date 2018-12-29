//package com.cvproject.herokushop.playground;

//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

//@ControllerAdvice
//@Component
//public class ExceptionTest extends SimpleMappingExceptionResolver {

//    @Override
//    protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("index");
//        modelAndView.addObject("name", "slovil oshibku");
//        return modelAndView;
//    }
//
//    @ExceptionHandler(Throwable.class)
//    public String lovim(Model model) {
//             model.addAttribute("name", "slovil oshibku");
//        return "index";
//    }
//}
