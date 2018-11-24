package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarMachine;

public interface NetbarMachineMapper {
    int deleteByPrimaryKey(Integer machineid);

    int insert(NetbarMachine record);

    int insertSelective(NetbarMachine record);

    NetbarMachine selectByPrimaryKey(Integer machineid);

    int updateByPrimaryKeySelective(NetbarMachine record);

    int updateByPrimaryKey(NetbarMachine record);
}