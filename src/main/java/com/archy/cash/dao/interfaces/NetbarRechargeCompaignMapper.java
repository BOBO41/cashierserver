package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarRechargeCompaign;

import java.util.List;

public interface NetbarRechargeCompaignMapper {

    int insertSelective(NetbarRechargeCompaign record);

    NetbarRechargeCompaign selectByPrimaryKey(Integer rechargecompaignid);

    List<NetbarRechargeCompaign> selectByGid(Integer gid);

    int updateByPrimaryKeySelective(NetbarRechargeCompaign record);

}