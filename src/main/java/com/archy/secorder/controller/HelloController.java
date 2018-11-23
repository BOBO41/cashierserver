package com.archy.secorder.controller;

import com.archy.secorder.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Resource
    private OrderService orderService;



    @RequestMapping("/hello")
    private String index(){
        this.logger.debug("hello");
        return this.orderService.getString();
    }



}
