package com.zhongge.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaoyong on 2017/7/21.
 */
@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
public class EurekaClientApplication {

    @Autowired
    protected DiscoveryClient discoveryClient;

    @GetMapping("/helloword")
    public ResponseEntity<String> helloworld(){
        discoveryClient.getInstances("EUREKA-SERVER-01");
        return ResponseEntity.ok("hello xxxholic");
    }

    public static void main(String[] args){
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
