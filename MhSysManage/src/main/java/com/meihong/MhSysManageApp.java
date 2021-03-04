package com.meihong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MhSysManageApp {
    public static void main(String[] args) {
        SpringApplication.run(MhSysManageApp.class,args);
    }
}
