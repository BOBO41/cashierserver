package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarBIlling;

public interface NetbarBIllingMapper {

    int insertSelective(NetbarBIlling record);

    NetbarBIlling selectByPrimaryKey(Long billingid);

    int updateByPrimaryKeySelective(NetbarBIlling record);

}