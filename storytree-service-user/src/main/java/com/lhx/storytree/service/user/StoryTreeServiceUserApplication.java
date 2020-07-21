package com.lhx.storytree.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.lhx.storytree.commons.mapper")
public class StoryTreeServiceUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(StoryTreeServiceUserApplication.class, args);
    }
}
