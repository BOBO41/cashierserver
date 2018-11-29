package com.archy.cash.service;

import com.archy.cash.dao.interfaces.NetbarMemberMapper;
import com.archy.cash.entity.Enum.SexCode;
import com.archy.cash.entity.NetbarMember;
import com.archy.cash.entity.Tuple.ThreeTuple;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

@Service
public class MemberService {

    @Resource
    private NetbarMemberMapper netbarMemberMapper;

    @Resource
    private CashService cashService;


    public NetbarMember findMemberByAccount(Integer gid,String account){
        return this.netbarMemberMapper.selectByAccount(account);
    }

    public NetbarMember findMemberByPhone(Integer gid,String phone){
        if(phone == null || phone == ""){
            return null;
        }
        return this.netbarMemberMapper.selectByPhone(phone);
    }


    @Transactional
    public ThreeTuple<Boolean,String,NetbarMember> addMember(Integer gid, String account,String phone,
                                                             String name, Integer sexCode, String address,
                                                             Integer memberType,Integer userid){
        NetbarMember member = new NetbarMember();

        if(this.findMemberByAccount(gid,account) != null){
            return new ThreeTuple<>(false,"身份证已经存在",null);
        }

        if(this.findMemberByPhone(gid,phone) != null){
            return new ThreeTuple<>(false,"手机号已经存在",null);
        }

        if(SexCode.valueOf(sexCode) == SexCode.END){
            return new ThreeTuple<>(false,"性别不合法",null);
        }

        if(this.cashService.findMemberType(memberType) == null){
            return new ThreeTuple<>(false,"会员等级错误",null);
        }

        member.setGid(gid);
        member.setAccount(account);
        member.setMembername(name);
        member.setPhone(phone);
        member.setMembertype(memberType);
        member.setAddress(address);
        member.setSex(sexCode);
        member.setLastupdatedate(new Date());
        member.setCreatedate(new Date());
        member.setCreator(userid);
        member.setCashbalance(0);
        member.setBasebalance(0);
        member.setAwardbalance(0);

        int r = this.netbarMemberMapper.insertSelective(member);

        if(r < 0){
            return new ThreeTuple<>(false,"服务器内部错误",null);
        }

        return new ThreeTuple<>(true,"",member);
    }

    public ThreeTuple<Boolean,String,NetbarMember> updateMember(Integer gid, String account,String phone,
                                     String name, Integer sexCode, String address,
                                     Integer memberType,Integer userid){

        NetbarMember netbarMember = this.netbarMemberMapper.selectByAccount(account);

        if(netbarMember == null){
            return new ThreeTuple<>(false,"会员不存在",null);
        }

        NetbarMember phoneMember = this.netbarMemberMapper.selectByPhone(phone);
        if(phoneMember != null && phoneMember.getAccount().equals(account) == false){
            return new ThreeTuple<>(false,"手机号已经被占用",null);
        }

        if(cashService.findMemberType(memberType) == null){
            return new ThreeTuple<>(false,"会员等级非法",null);
        }

        netbarMember.setMembername(name);
        netbarMember.setPhone(phone);
        netbarMember.setAddress(address);
        netbarMember.setSex(sexCode);
        netbarMember.setMembertype(memberType);
        netbarMember.setLastupdatedate(new Date());

        this.netbarMemberMapper.updateByPrimaryKeySelective(netbarMember);

        return new ThreeTuple<>(true,"",netbarMember);

    }

    public List<NetbarMember> queryMember(Integer gid,String name){
        return this.netbarMemberMapper.queryByName(name);
    }


}
