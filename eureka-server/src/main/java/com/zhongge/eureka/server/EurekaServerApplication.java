package com.zhongge.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Comparator;


/**
 * Created by xiaoyong on 2017/7/20.
 */
@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@EnableEurekaServer
@RestController
public class EurekaServerApplication {

    @RequestMapping("/hello")
    public String home() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
