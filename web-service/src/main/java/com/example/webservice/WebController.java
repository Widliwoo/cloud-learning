package com.example.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WebController {

    @Autowired
    private AgeFeignClient ageClient;

    @Autowired
    private GreetingFeignClient greetingClient;

    @GetMapping("/info")
    public String getInfo() {
        String greeting = greetingClient.getGreeting();
        Long age = ageClient.getAge();

        return String.format("%s, %s, %s", greeting, "${NOPE}", age);
    }

    @GetMapping
    public String test() {
        return "test";
    }
}
