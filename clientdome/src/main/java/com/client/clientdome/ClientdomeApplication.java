package com.client.clientdome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ClientdomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientdomeApplication.class, args);
    }
}
