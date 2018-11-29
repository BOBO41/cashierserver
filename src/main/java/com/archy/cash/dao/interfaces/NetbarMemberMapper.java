package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarMember;
import java.util.List;

public interface NetbarMemberMapper {

    int insertSelective(NetbarMember record);

    NetbarMember selectByAccount(String account);

    NetbarMember selectByPhone(String phone);

    List<NetbarMember> queryByName(String name);

    int updateByPrimaryKeySelective(NetbarMember record);

}