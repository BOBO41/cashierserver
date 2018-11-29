package com.archy.cash.web;

import com.archy.cash.entity.NetbarMember;
import com.archy.cash.entity.Result;
import com.archy.cash.entity.ResultState;
import com.archy.cash.entity.Tuple.ThreeTuple;
import com.archy.cash.service.CashService;
import com.archy.cash.service.MemberService;
import com.archy.cash.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/member")
@RestController
@EnableAutoConfiguration
public class MemberController {

    private Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Resource
    private OrderService orderService;

    @Resource
    private MemberService memberService;

    @Resource
    private CashService cashService;


    @RequestMapping("/add")
    @ResponseBody
    private Result addMember(String account,String phone,String name,Integer sexCode,String address,Integer memberType,Integer userid){

        ThreeTuple<Boolean,String, NetbarMember> result = this.memberService.addMember(cashService.getGid(),account,phone,name,
                sexCode,address,memberType,userid);

        if(result.first == false){
            return new Result(ResultState.FAIL,result.second);
        }

        return new Result(ResultState.SUCCESS,result.third);
    }

    @RequestMapping("/update")
    @ResponseBody
    private Result updateMember(String account,String phone,String name,Integer sexCode,String address,Integer memberType,Integer userid){

        ThreeTuple<Boolean,String, NetbarMember> result = this.memberService.updateMember(cashService.getGid(),account,phone,name,
                sexCode,address,memberType,userid);

        if(result.first == false){
            return new Result(ResultState.FAIL,result.second);
        }

        return new Result(ResultState.SUCCESS,null);
    }

    @RequestMapping("/query")
    @ResponseBody
    private Result queryMember(String name){

        List<NetbarMember> list = this.memberService.queryMember(cashService.getGid(),name);

        return new Result(ResultState.SUCCESS,list);
    }

    @RequestMapping("/index")
    @ResponseBody
    private Result indexMember(String account){

        NetbarMember netbarMember = this.memberService.findMemberByAccount(cashService.getGid(),account);
        if(netbarMember == null){
            return new Result(ResultState.FAIL,"账号不存在");
        }

        return new Result(ResultState.SUCCESS,netbarMember);
    }


}
