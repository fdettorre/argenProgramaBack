package com.dettorrecv.backend;

import java.util.Arrays;
import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

@CrossOrigin(origins = "https://fdetcv.web.app") 
@Bean

        
public FilterRegistrationBean simpleCorsFilter() {  
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
    CorsConfiguration config = new CorsConfiguration();  
    config.setAllowCredentials(true); 
    // *** URL below needs to match the Vue client URL and port ***
    //*config.setAllowedOrigins(Collections.singletonList("https://fdetcv.herokuapp.com")); ***
    config.setAllowedOrigins(Collections.singletonList("https://fdetcv.web.app/"));
    config.setAllowedMethods(Collections.singletonList("*"));  
    config.setAllowedHeaders(Collections.singletonList("*"));  
    source.registerCorsConfiguration("/**", config);  
    FilterRegistrationBean bean = new FilterRegistrationBean<>(new CorsFilter(source));
    bean.setOrder(Ordered.HIGHEST_PRECEDENCE);  
    return bean;  
}   


public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {

            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("https://fdetcv.web.app/");
            }
        };
    }
}
