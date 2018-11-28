package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarWeekPrice;

import java.util.List;

public interface NetbarWeekPriceMapper {

    int insertSelective(NetbarWeekPrice record);

    NetbarWeekPrice selectByPrimaryKey(Integer id);

    List<NetbarWeekPrice> selectByGid(Integer gid);

    int updateByPrimaryKeySelective(NetbarWeekPrice record);

}