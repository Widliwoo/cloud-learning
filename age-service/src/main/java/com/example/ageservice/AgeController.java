package com.example.ageservice;

import com.netflix.discovery.EurekaClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class AgeController {

    private static final Logger log = LoggerFactory.getLogger(AgeController.class);

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Value("${test.defaultValue}")
    private String defaultValue;

    @Value("${test.decreaseOn}")
    private Long decreaseOn;

    @GetMapping("/age")
    public Long age() {
        log.debug("{}#age requested;", this.getClass().getCanonicalName());
        return Math.round(18 + Math.random() * 18) - decreaseOn;
    }

    @GetMapping("/test")
    public String test() {
        return String.format(
                "Hello from '%s'!", eurekaClient.getApplication(appName).getName());
    }

    @GetMapping("/defaultValue")
    public String defaultValue() {
        return defaultValue;
    }
}
