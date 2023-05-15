package com.lily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    // add a new method for rest endpoint
    @GetMapping("/")
    public GreetResponse greet(){

        return new GreetResponse("Hello world");
    }

    record GreetResponse(String greet) {}
}
