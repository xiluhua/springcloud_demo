package com.leslie.springcloud_demo.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

// 扫描 Swagger2Config
@ComponentScan("com.leslie")
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3378 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3378.class,args);
        System.out.println("http://localhost:3378/swagger-ui.html");
    }
}
