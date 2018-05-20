package com.adesk.springclouddome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.PropertySource;

@PropertySource( "classpath:application-ser.properties")
@EnableEurekaServer
@SpringBootApplication
public class SpringclouddomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringclouddomeApplication.class, args);
    }
}
