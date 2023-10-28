package com.example.springbootlab6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootLab6Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLab6Application.class, args);
    }

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }
}