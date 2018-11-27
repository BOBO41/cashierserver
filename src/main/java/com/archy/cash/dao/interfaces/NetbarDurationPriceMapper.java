package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarDurationPrice;

public interface NetbarDurationPriceMapper {

    int insertSelective(NetbarDurationPrice record);

    NetbarDurationPrice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NetbarDurationPrice record);
}