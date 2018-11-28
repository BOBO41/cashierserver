package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarMemberType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NetbarMemberTypeMapper {

    int insertSelective(NetbarMemberType record);

    NetbarMemberType selectByPrimaryKey(@Param("membertypeplanid") Integer membertypeplanid, @Param("membertypeid") Integer membertypeid);

    int updateByPrimaryKeySelective(NetbarMemberType record);

    List<NetbarMemberType> selectByGid(Integer gid);

}