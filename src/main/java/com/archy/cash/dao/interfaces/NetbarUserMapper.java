package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarUser;

public interface NetbarUserMapper {

    int insertSelective(NetbarUser record);

    NetbarUser selectByPrimaryKey(Integer netbaruserid);

    int updateByPrimaryKeySelective(NetbarUser record);
}