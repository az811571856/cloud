package com.newbanker.fac.cloud.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 开发人员在本机host配置：
 * 127.0.0.1 server1
   127.0.0.1 server2
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterCenterMain {

    public static void main(String[] args) {
        SpringApplication.run(RegisterCenterMain.class, args);
    }
}
