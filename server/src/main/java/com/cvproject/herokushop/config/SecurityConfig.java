package com.cvproject.herokushop.config;

import com.cvproject.herokushop.auth.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserService userService;

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http
                .headers().frameOptions().sameOrigin()
                .and()
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/admin/**").authenticated()
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/")
                .failureUrl("/error")
                .and()
                .logout()
                .deleteCookies("JSESSIONID")
                .logoutSuccessUrl("/");

    }


    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Override
    @Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}


