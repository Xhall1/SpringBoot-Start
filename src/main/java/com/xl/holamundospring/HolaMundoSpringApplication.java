package com.xl.holamundospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolaMundoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HolaMundoSpringApplication.class, args);
        System.out.println("Hello World Spring MVC");
    }

}
