package com.jurisdiction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com")
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class JurisdictionApplication {

    public static void main(String[] args) {
        SpringApplication.run(JurisdictionApplication.class, args);
    }

}
