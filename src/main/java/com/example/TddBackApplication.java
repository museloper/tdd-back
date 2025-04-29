package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.user")
@SpringBootApplication(scanBasePackages = "com.example")
public class TddBackApplication {
    public static void main(String[] args) {
        SpringApplication.run(TddBackApplication.class, args);
    }
}