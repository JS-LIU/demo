package com.jurisdictionService1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com")
@SpringBootApplication
public class JurisdictionApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(JurisdictionApplication1.class, args);
    }

}
