package com.example.greetingservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingController {

    private static final Logger log = LoggerFactory.getLogger(GreetingController.class);

    @Value("${test.greetingSuffix}")
    private String greetingSuffix;

    @GetMapping("/greeting")
    public String greet() {
        log.debug("{}#greet requested;", this.getClass().getCanonicalName());
        return greetingSuffix + "Greeting!";
    }
}
