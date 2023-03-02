package com.a.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PayFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(PayFeignMain80.class,args);
    }
}
