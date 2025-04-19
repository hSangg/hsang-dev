package com.sang.hsangdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HSangDevApplication {

    public static void main(String[] args) {
        System.out.println("DB URL: " + System.getenv("DB_URL"));
        SpringApplication.run(HSangDevApplication.class, args);
    }

}
