package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarDuty;

public interface NetbarDutyMapper {
    int deleteByPrimaryKey(Integer dutyid);

    int insert(NetbarDuty record);

    int insertSelective(NetbarDuty record);

    NetbarDuty selectByPrimaryKey(Integer dutyid);

    int updateByPrimaryKeySelective(NetbarDuty record);

    int updateByPrimaryKey(NetbarDuty record);
}