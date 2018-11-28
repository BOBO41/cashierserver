package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarBaseInfo;

public interface NetbarBaseInfoMapper {

    int insertSelective(NetbarBaseInfo record);

    NetbarBaseInfo selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(NetbarBaseInfo record);
}