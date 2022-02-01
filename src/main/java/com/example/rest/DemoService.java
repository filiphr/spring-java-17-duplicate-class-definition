package com.example.rest;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author Filip Hrisafov
 */
@Service
public class DemoService {

    @Async
    public void someMethod() {

    }

}
