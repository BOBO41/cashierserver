package com.archy.cash.web;

import com.archy.cash.entity.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/duty")
@RestController
@EnableAutoConfiguration
public class DutyController {

    private Logger logger = LoggerFactory.getLogger(getClass().getName());

    @RequestMapping("/query")
    @ResponseBody
    private Result query(){
        return new Result();
    }

    @RequestMapping("/submit")
    @ResponseBody
    private Result submit(){
        return new Result();
    }

}
