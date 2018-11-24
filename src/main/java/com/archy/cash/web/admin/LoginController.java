package com.archy.cash.web.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration
@RequestMapping("/admin")
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass().getName());

    @RequestMapping("/login")
    private ModelAndView login(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/login");
        return mv;
    }


    @RequestMapping("/loginByUser")
    private ModelAndView loginByUser(String username,String password){
        ModelAndView mv = new ModelAndView();
        logger.info("username:" + username + ",password:" + password);
        mv.setViewName("admin/welcome");
        return mv;
    }

}
