package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarUser;

public interface NetbarUserMapper {
    int deleteByPrimaryKey(Integer netbaruserid);

    int insert(NetbarUser record);

    int insertSelective(NetbarUser record);

    NetbarUser selectByPrimaryKey(Integer netbaruserid);

    int updateByPrimaryKeySelective(NetbarUser record);

    int updateByPrimaryKey(NetbarUser record);
}