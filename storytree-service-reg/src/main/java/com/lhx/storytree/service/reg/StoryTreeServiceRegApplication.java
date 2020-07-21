package com.lhx.storytree.service.reg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.lhx.storytree.commons.mapper")
public class StoryTreeServiceRegApplication {
    public static void main(String[] args) {
        SpringApplication.run(StoryTreeServiceRegApplication.class, args);
    }
}
