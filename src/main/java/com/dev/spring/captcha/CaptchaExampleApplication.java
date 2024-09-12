package com.dev.spring.captcha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.dev.spring.captcha.config.AppConfig;

@SpringBootApplication
@Import(AppConfig.class)
public class CaptchaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaptchaExampleApplication.class, args);
    }

}