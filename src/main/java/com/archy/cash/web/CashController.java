package com.archy.cash.web;


import com.archy.cash.entity.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cash")
@RestController
@EnableAutoConfiguration
public class CashController {

    private Logger logger = LoggerFactory.getLogger(getClass().getName());

    @RequestMapping("/charge")
    @ResponseBody
    private Result charge(){
        return new Result();
    }

    @RequestMapping("/active")
    @ResponseBody
    private Result active(){
        return new Result();
    }



    @RequestMapping("/login")
    @ResponseBody
    private Result login(){
        return new Result();
    }

    @RequestMapping("/logoff")
    @ResponseBody
    private Result logoff(){
        return new Result();
    }



}
