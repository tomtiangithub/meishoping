package com.meihong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MhShopAppication {
    public static void main(String[] args) {
        SpringApplication.run(MhShopAppication.class,args);
    }
}
