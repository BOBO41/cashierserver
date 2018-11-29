package com.archy.cash.service;

import com.archy.cash.dao.interfaces.NetbarMemberMapper;
import com.archy.cash.dao.interfaces.NetbarRechargeOrderMapper;
import com.archy.cash.entity.Enum.RechargeSource;
import com.archy.cash.entity.Enum.RechargeWay;
import com.archy.cash.entity.NetbarMember;
import com.archy.cash.entity.NetbarRechargeOrder;
import com.archy.cash.entity.Enum.RechargeType;
import com.archy.cash.entity.Tuple.ThreeTuple;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.Date;

@Service
public class OrderService {

    @Resource
    private NetbarRechargeOrderMapper netbarRechargeOrderMapper;

    @Resource
    private NetbarMemberMapper netbarMemberMapper;

    @Resource
    private CashService cashService;


    @Transactional
    public ThreeTuple<Boolean,String,NetbarMember> chargeMember(Integer gid, String account, Integer cash, Integer base, Integer award, Integer source, Integer paytype, Integer userid){

        NetbarMember netbarMember = this.cashService.findByAccount(account);
        if(netbarMember == null){
            netbarMember = this.netbarMemberMapper.selectByAccount(account);
        }

        if(netbarMember == null){
            return new ThreeTuple<>(false,"会员不存在",null);
        }

        if(cash + base + award <= 0){
            return new ThreeTuple<>(false,"金额非法",netbarMember);
        }

        if(RechargeSource.valueOf(source) == RechargeSource.END){
            return new ThreeTuple<>(false,"非法参数",null);
        }

        if(RechargeWay.valueOf(paytype) == RechargeWay.END){
            return new ThreeTuple<>(false,"非法参数",null);
        }


        NetbarRechargeOrder order = new NetbarRechargeOrder();

        order.setGid(gid);
        order.setAccount(account);

        if(cash > 0){
            order.setRechargetype(RechargeType.DEPOSIT.value());
            order.setDeposit(cash);
            order.setRechargefee(0);
            order.setAdwardfee(0);
            netbarMember.setCashbalance(netbarMember.getCashbalance() + cash);
        }
        else{
            order.setRechargetype(RechargeType.ACCOUNTCHARGE.value());
            order.setDeposit(0);
            order.setRechargefee(base);
            order.setAdwardfee(award);
            netbarMember.setBasebalance(netbarMember.getBasebalance() + base);
            netbarMember.setAwardbalance(netbarMember.getAwardbalance() + award);
        }

        order.setPosaccount(userid);
        order.setLastupdatedate(new Date());
        order.setRechargeway(paytype);
        order.setRechargesource(source);
        order.setRechargedate(new Date());

        netbarMemberMapper.updateByPrimaryKeySelective(netbarMember);
        netbarRechargeOrderMapper.insertSelective(order);

        return new ThreeTuple<>(true,"成功",netbarMember);
    }


}
