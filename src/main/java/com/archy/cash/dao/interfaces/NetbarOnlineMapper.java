package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarOnline;

public interface NetbarOnlineMapper {
    int deleteByPrimaryKey(Long onlineid);

    int insert(NetbarOnline record);

    int insertSelective(NetbarOnline record);

    NetbarOnline selectByPrimaryKey(Long onlineid);

    int updateByPrimaryKeySelective(NetbarOnline record);

    int updateByPrimaryKey(NetbarOnline record);
}