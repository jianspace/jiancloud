package com.jian.blogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JianBlogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JianBlogsApplication.class, args);
    }

}
