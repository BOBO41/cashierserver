package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarRechargeOrder;

public interface NetbarRechargeOrderMapper {
    int deleteByPrimaryKey(Long rechargeorderid);

    int insert(NetbarRechargeOrder record);

    int insertSelective(NetbarRechargeOrder record);

    NetbarRechargeOrder selectByPrimaryKey(Long rechargeorderid);

    int updateByPrimaryKeySelective(NetbarRechargeOrder record);

    int updateByPrimaryKey(NetbarRechargeOrder record);
}