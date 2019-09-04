package com.jiuying.controller;

import com.jiuying.entity.User;
import com.jiuying.service.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther guoruowang
 * @Date 2019/9/2 17:36
 **/
@RestController
public class FeignController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("feign/{id}")
    public User findByIdFeign(@PathVariable Long id) {
        return this.userFeignClient.findByIdFeign(id);
    }
}
