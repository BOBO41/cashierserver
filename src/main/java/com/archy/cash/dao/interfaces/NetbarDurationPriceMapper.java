package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarDurationPrice;

import java.util.List;

public interface NetbarDurationPriceMapper {

    int insertSelective(NetbarDurationPrice record);

    NetbarDurationPrice selectByPrimaryKey(Integer id);

    List<NetbarDurationPrice> selectByGid(Integer gid);

    int updateByPrimaryKeySelective(NetbarDurationPrice record);
}