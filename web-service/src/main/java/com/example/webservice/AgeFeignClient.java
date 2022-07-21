package com.example.webservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "age-service")
public interface AgeFeignClient {

    @GetMapping("/age")
    Long getAge();
}
