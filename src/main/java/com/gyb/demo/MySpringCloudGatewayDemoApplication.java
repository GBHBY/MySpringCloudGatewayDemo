package com.gyb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MySpringCloudGatewayDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringCloudGatewayDemoApplication.class, args);
    }

}
