package com.idevalot.backend.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

// @Configuration
public class BasicAuthenticationSecurityConfiguration {

  // Filter chain
  // authentication all requests
  // basic authentication
  // disabling csrf
  // stateless rest api

  @SuppressWarnings({ "deprecation", "removal" })
  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    return http.authorizeRequests(auth -> auth
        .requestMatchers(HttpMethod.OPTIONS, "/**")
        .permitAll()
        .anyRequest().authenticated())
        .httpBasic(Customizer.withDefaults())
        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).csrf().disable()
        .build();
  }

}
