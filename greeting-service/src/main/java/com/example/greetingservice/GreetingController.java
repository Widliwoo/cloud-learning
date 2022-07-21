package com.example.greetingservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final Logger log = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping("/greeting")
    public String greet() {
        log.debug("{}#greet requested;", this.getClass().getCanonicalName());
        return "Greeting!";
    }
}
