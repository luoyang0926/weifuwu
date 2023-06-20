package com.xy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PayMeantMain02 {
    public static void main(String[] args) {
        SpringApplication.run(PayMeantMain02.class, args);
    }
}
