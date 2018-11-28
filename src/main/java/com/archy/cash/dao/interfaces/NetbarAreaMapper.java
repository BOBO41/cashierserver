package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarArea;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NetbarAreaMapper {

    int insertSelective(NetbarArea record);

    NetbarArea selectByPrimaryKey(@Param("areaid") Integer areaid, @Param("gid") Integer gid);

    int updateByPrimaryKeySelective(NetbarArea record);

    List<NetbarArea> selectByGid(Integer gid);

}