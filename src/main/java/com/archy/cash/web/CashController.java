package com.archy.cash.web;


import com.archy.cash.entity.NetbarMember;
import com.archy.cash.entity.Result;
import com.archy.cash.entity.ResultState;
import com.archy.cash.entity.Tuple.ThreeTuple;
import com.archy.cash.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/cash")
@RestController
@EnableAutoConfiguration
public class CashController {

    private Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Resource
    private OrderService orderService;

    @RequestMapping("/charge")
    @ResponseBody
    private Result charge(Integer gid,String account,Integer cash,Integer base,Integer award,Integer paytype,Integer source,Integer userid){

        ThreeTuple<Boolean,String, NetbarMember> result = this.orderService.chargeMember(gid,account,cash,base,award,source,paytype,userid);

        if(result.first == false){
            return new Result(ResultState.FAIL,result.second);
        }

        return new Result(ResultState.SUCCESS,result.third);
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
