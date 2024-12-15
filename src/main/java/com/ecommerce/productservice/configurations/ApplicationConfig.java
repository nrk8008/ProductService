package com.ecommerce.productservice.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {
    @Bean // Denotes that this method is a bean producer
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}

