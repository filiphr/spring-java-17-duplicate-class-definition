package com.example.rest;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Filip Hrisafov
 */
@RestController
public class ExampleResource {

    protected final Environment environment;
    protected final DemoService demoService;

    public ExampleResource(Environment environment, DemoService demoService) {
        this.environment = environment;
        this.demoService = demoService;
    }

    @GetMapping("/example")
    public String getExample() {
        return environment.getProperty("example.prop");
    }

}
