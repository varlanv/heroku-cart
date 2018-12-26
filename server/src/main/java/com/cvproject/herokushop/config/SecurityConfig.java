//package com.cvproject.herokushop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/", true)
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
//    }
//    @Override
//    protected void configure(final HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .antMatchers("/anonymous*").anonymous()
//                .antMatchers("/login*").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/", true)
//                //.failureUrl("/login.html?error=true")
//                .and()
//                .logout()
//                .logoutUrl("/perform_logout")
//                .deleteCookies("JSESSIONID");
//    }

//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
