package com.in28minutes.rest.webservice.restfulwebservices.config;

/**
 * Created By dhhaval thakkar on 2024-01-04
 */

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableWebMvc
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
       http.cors(httpSecurityCorsConfigurer ->
               httpSecurityCorsConfigurer.configurationSource(request -> {
                   CorsConfiguration configuration = new CorsConfiguration();
                   configuration.setAllowedOrigins(List.of("http://localhost:3000"));
                   configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE"));
                   configuration.setAllowedHeaders(List.of("*"));

                   return configuration;
       }));
       http.csrf(AbstractHttpConfigurer::disable);
       return http.build();
    }

}
