package com.microservice.post.post.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {  //helps us to interact with other project


    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
