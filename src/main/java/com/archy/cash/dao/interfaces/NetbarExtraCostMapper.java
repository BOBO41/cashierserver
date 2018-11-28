package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarExtraCost;

import java.util.List;

public interface NetbarExtraCostMapper {

    int insertSelective(NetbarExtraCost record);

    NetbarExtraCost selectByPrimaryKey(Integer id);

    List<NetbarExtraCost> selectByGid(Integer gid);

    int updateByPrimaryKeySelective(NetbarExtraCost record);

}