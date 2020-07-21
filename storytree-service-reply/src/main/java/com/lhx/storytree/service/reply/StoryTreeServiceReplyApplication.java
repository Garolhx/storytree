package com.lhx.storytree.service.reply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.lhx.storytree.commons.mapper")
public class StoryTreeServiceReplyApplication {
    public static void main(String[] args) {
        SpringApplication.run(StoryTreeServiceReplyApplication.class, args);
    }
}
