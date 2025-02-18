package com.hh.hhojbackendgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HhojBackendGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HhojBackendGatewayApplication.class, args);
    }

}
