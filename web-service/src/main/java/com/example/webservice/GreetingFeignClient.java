package com.example.webservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "greeting-service")
public interface GreetingFeignClient {

    @GetMapping("/greeting")
    String getGreeting();
}
