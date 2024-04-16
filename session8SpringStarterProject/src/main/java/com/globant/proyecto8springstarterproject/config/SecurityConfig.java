package com.globant.proyecto8springstarterproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;

@Configuration
public class SecurityConfig {
    /*@Bean    //COMO YA SE VA A UTILIZAR LA BD NO ES NECESARIO ESTO SOLO ES EN MEMORIA PARA PROBAR MAS RAPIDO
    public InMemoryUserDetailsManager userDetailsService() {
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        UserDetails user = users
                .username("user")
                .password("cr7")
                .roles("USER")
                .build();
        UserDetails admin = users
                .username("admin")
                .password("admin123")
                .roles("USER", "ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }*/
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .requestMatchers("/users/**").hasRole("ADMIN")
                .requestMatchers("/roles/**").hasAnyRole("ADMIN", "USER", "SUPPORT")
                .anyRequest().authenticated()
                .and()
                .httpBasic()
                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.FORBIDDEN));
        return http.build();
    }
}