package com.jiuying.service;

import com.jiuying.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * @auther guoruowang
 * @Date 2019/9/2 18:33
 **/
@Service
public class RibbonHystrixService {

    @Autowired
    private RestTemplate restTemplate;

    private static final Logger LOGGER = LoggerFactory.getLogger(RibbonHystrixService.class);

    /**
     * 使用@HystrixCommand注解指定当方法发生异常时调用的方法
     *
     * @return com.jiuying.entity.User
     * @auther guoruowang
     * @Date 18:37 2019/9/2
     * @Param [id]
     **/
    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(Long id) {
        return this.restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
    }

    /**
     * hystrix fallback方法
     *
     * @return com.jiuying.entity.User
     * @auther guoruowang
     * @Date 18:39 2019/9/2
     * @Param [id]
     **/
    public User fallback(Long id) {
        RibbonHystrixService.LOGGER.info("发生异常，进入fallback方法，接收的参数：id={}", id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }
}
