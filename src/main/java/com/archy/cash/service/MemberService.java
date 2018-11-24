package com.archy.cash.service;

import com.archy.cash.dao.interfaces.NetbarMemberMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MemberService {

    @Resource
    private NetbarMemberMapper netbarMemberMapper;



}
