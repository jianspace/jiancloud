package com.jian.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JianEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JianEurekaApplication.class, args);
    }

}
