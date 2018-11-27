package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarExtraCost;

public interface NetbarExtraCostMapper {

    int insertSelective(NetbarExtraCost record);

    NetbarExtraCost selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NetbarExtraCost record);

}