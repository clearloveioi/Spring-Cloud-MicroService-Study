package com.jiuying.service;

import com.jiuying.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 使用@FeignClient("microservice-provider-user")注解绑定microservice-provider-user服务，还可以使用url参数指定一个url
 *
 * @auther guoruowang
 * @Date 19:03 2019/9/2
 * @Param
 * @return
 **/
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

    @RequestMapping("/{id}")
    User findByIdFeign(@PathVariable("id") Long id);
}
