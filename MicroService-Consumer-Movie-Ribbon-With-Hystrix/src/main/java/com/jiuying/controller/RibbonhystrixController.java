package com.jiuying.controller;

import com.jiuying.entity.User;
import com.jiuying.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther guoruowang
 * @Date 2019/9/2 18:43
 **/
@RestController
public class RibbonhystrixController {

    @Autowired
    private RibbonHystrixService ribbonHystrixService;

    @GetMapping("/ribbon/{id}")
    public User findByid(@PathVariable Long id) {
        return this.ribbonHystrixService.findById(id);
    }
}
