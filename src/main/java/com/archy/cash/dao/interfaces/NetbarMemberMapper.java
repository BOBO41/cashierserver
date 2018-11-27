package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarMember;

public interface NetbarMemberMapper {

    int insertSelective(NetbarMember record);

    NetbarMember selectByPrimaryKey(Long memberid);

    int updateByPrimaryKeySelective(NetbarMember record);

}