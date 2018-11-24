package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarBIlling;

public interface NetbarBIllingMapper {
    int deleteByPrimaryKey(Long billingid);

    int insert(NetbarBIlling record);

    int insertSelective(NetbarBIlling record);

    NetbarBIlling selectByPrimaryKey(Long billingid);

    int updateByPrimaryKeySelective(NetbarBIlling record);

    int updateByPrimaryKey(NetbarBIlling record);
}