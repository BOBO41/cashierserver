package com.archy.cash.web.pay;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/pay")
public class PayController {

    @RequestMapping("/payOrder")
    @ResponseBody
    private Map<String,Object> payOrder(){
        Map<String,Object> map = new HashMap<String,Object>();

    

        return map;
    }



}
