package com.jiuying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 通过@EnableFeignClients开启Feign
 *
 * @auther guoruowang
 * @Date 17:26 2019/9/2
 * @Param
 * @return
 **/
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MovieFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieFeignApplication.class, args);
    }
}
