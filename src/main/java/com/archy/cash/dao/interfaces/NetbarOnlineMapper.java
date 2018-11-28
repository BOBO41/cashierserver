package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarOnline;

import java.util.List;

public interface NetbarOnlineMapper {

    int insertSelective(NetbarOnline record);

    NetbarOnline selectByPrimaryKey(Long onlineid);


    int updateByPrimaryKeySelective(NetbarOnline record);

}