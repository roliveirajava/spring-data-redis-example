package com.roliveira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class RedisExampleApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(RedisExampleApplication.class, args);
    }
}
