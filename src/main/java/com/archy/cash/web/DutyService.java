package com.archy.cash.web;

import com.archy.cash.dao.interfaces.NetbarDutyMapper;
import com.archy.cash.entity.NetbarDuty;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DutyService {

    @Resource
    private NetbarDutyMapper netbarDutyMapper;




}
