package com.example.stageperfectionnementbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class StageperfectionnementBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(StageperfectionnementBackendApplication.class, args);
    }
    @Bean
    BCryptPasswordEncoder getBCE() {
        return new BCryptPasswordEncoder();
    }

}
