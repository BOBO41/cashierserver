package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarRechargeOrder;

public interface NetbarRechargeOrderMapper {
    int insertSelective(NetbarRechargeOrder record);

    NetbarRechargeOrder selectByPrimaryKey(Long rechargeorderid);

    int updateByPrimaryKeySelective(NetbarRechargeOrder record);

}