package com.example.my_backend_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MyBackendAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBackendAppApplication.class, args);
    }
}

@RestController
class MyController {

    @GetMapping("/")
    public String home() {
        return "こんにちは";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello";
    }
}
