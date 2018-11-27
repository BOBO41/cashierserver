package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarPeriodPrice;

public interface NetbarPeriodPriceMapper {

    int insertSelective(NetbarPeriodPrice record);

    NetbarPeriodPrice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NetbarPeriodPrice record);

}