package com.example.dataway;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableHasor
@EnableHasorWeb
@SpringBootApplication(scanBasePackages = {"net.example.hasor"})
public class DatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatewayApplication.class, args);
    }

}
