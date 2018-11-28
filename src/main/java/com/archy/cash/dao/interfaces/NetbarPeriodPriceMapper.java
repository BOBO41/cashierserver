package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarPeriodPrice;

import java.util.List;

public interface NetbarPeriodPriceMapper {

    int insertSelective(NetbarPeriodPrice record);

    NetbarPeriodPrice selectByPrimaryKey(Integer id);

    List<NetbarPeriodPrice> selectByGid(Integer gid);

    int updateByPrimaryKeySelective(NetbarPeriodPrice record);

}