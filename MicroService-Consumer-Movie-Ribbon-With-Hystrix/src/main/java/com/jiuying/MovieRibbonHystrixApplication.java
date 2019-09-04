package com.jiuying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 使用@EnableCircuitBreaker注解开启断路器功能
 *
 * @auther guoruowang
 * @Date 18:27 2019/9/2
 * @Param
 * @return
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class MovieRibbonHystrixApplication {

    /**
     * 实例化RestTemplate，通过@LoadBalanced注解开启负载均衡功能
     *
     * @return
     * @auther guoruowang
     * @Date 18:30 2019/9/2
     * @Param
     **/
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MovieRibbonHystrixApplication.class, args);
    }
}
