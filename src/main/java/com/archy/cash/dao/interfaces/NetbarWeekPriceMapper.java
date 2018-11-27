package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarWeekPrice;

public interface NetbarWeekPriceMapper {

    int insertSelective(NetbarWeekPrice record);

    NetbarWeekPrice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NetbarWeekPrice record);

}