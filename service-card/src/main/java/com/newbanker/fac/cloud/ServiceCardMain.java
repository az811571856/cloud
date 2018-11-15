package com.newbanker.fac.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceCardMain {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCardMain.class, args);
    }
}
