package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarMemberType;
import org.apache.ibatis.annotations.Param;

public interface NetbarMemberTypeMapper {
    int deleteByPrimaryKey(@Param("membertypeplanid") Integer membertypeplanid, @Param("membertypeid") Integer membertypeid);

    int insert(NetbarMemberType record);

    int insertSelective(NetbarMemberType record);

    NetbarMemberType selectByPrimaryKey(@Param("membertypeplanid") Integer membertypeplanid, @Param("membertypeid") Integer membertypeid);

    int updateByPrimaryKeySelective(NetbarMemberType record);

    int updateByPrimaryKey(NetbarMemberType record);
}