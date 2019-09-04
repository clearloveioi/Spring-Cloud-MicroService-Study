package com.jiuying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @auther guoruowang
 * @Date 2019/9/2 16:29
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class MovieRibbonApplication {

    /**
     * 实例化RestTemplate，通过@LoadBalanced注解开启负载均衡能力
     *
     * @return org.springframework.web.client.RestTemplate
     * @auther guoruowang
     * @Date 16:30 2019/9/2
     * @Param []
     **/
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MovieRibbonApplication.class, args);
    }
}
