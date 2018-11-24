package com.archy.cash.web;

import com.archy.cash.entity.Result;
import com.archy.cash.entity.ResultState;
import com.archy.cash.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/member")
@RestController
@EnableAutoConfiguration
public class MemberController {

    private Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Resource
    private OrderService orderService;



    @RequestMapping("/add")
    @ResponseBody
    private Result addMember(){
        return new Result(ResultState.SUCCESS,null);
    }

    @RequestMapping("/update")
    @ResponseBody
    private Result updateMember(){
        return new Result(ResultState.SUCCESS,null);
    }

    @RequestMapping("/query")
    @ResponseBody
    private Result queryMember(){
        return new Result();
    }

    @RequestMapping("/index")
    @ResponseBody
    private Result indexMember(){
        return new Result();
    }


}
