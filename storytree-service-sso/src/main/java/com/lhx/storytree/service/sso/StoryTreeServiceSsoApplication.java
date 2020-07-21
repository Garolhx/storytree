package com.lhx.storytree.service.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.lhx.storytree.commons.mapper")
public class StoryTreeServiceSsoApplication {
    public static void main(String[] args) {
        SpringApplication.run(StoryTreeServiceSsoApplication.class, args);
    }
}
