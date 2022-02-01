package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationDefaultTests {

    @Autowired
    protected TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
        ResponseEntity<String> response = restTemplate.getForEntity("/service/example", String.class);

        assertThat(response.getBody()).isNull();
    }

}
