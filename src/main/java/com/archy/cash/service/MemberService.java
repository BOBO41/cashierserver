package com.archy.cash.service;

import com.archy.cash.dao.interfaces.NetbarMemberMapper;
import com.archy.cash.entity.NetbarMember;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MemberService {

    @Resource
    private NetbarMemberMapper netbarMemberMapper;



    public NetbarMember addMember(String account,String name,Integer memberType){
        NetbarMember member = new NetbarMember();
        member.setAccount(account);
        member.setMembername(name);

        

        member.setCashbalance(0);

        return member;
    }


}
