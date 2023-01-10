package com.no4.virpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Times
 */
@SpringBootApplication
public class VirpayApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(VirpayApplication.class);
    }

    public static void main(String[] args) {
        System.out.println("springboot...start");
        SpringApplication.run(VirpayApplication.class, args);
        System.out.println("springboot...end");

    }
}
