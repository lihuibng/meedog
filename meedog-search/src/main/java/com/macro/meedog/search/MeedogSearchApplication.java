package com.macro.meedog.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.macro.meedog")
public class MeedogSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeedogSearchApplication.class, args);
    }
}
