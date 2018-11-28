package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarMachine;

import java.util.List;

public interface NetbarMachineMapper {

    int insertSelective(NetbarMachine record);

    NetbarMachine selectByPrimaryKey(Integer machineid);

    List<NetbarMachine> selectByGid(Integer gid);

    int updateByPrimaryKeySelective(NetbarMachine record);

}