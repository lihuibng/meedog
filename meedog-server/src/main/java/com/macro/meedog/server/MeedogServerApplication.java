package com.macro.meedog.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.macro.meedog")
public class MeedogServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeedogServerApplication.class, args);
    }

}
