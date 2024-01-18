package com.in28minutes.rest.webservice.restfulwebservices.config;

/**
 * Created By dhhaval thakkar on 2024-01-04
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
       return
               http
                       .authorizeHttpRequests(auth -> auth
                               .requestMatchers(AntPathRequestMatcher.antMatcher(HttpMethod.OPTIONS, "/**"))
                               .permitAll()
                               .anyRequest().authenticated())
                       .httpBasic(withDefaults())
                       .sessionManagement(session ->
                               session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                       .csrf(AbstractHttpConfigurer::disable)
                       .build();
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("*")
                        .allowedOrigins("http://localhost:3000");
            }
        };
    }
}
