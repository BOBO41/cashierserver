package com.archy.cash.dao.interfaces;

import com.archy.cash.entity.NetbarArea;
import org.apache.ibatis.annotations.Param;

public interface NetbarAreaMapper {
    int deleteByPrimaryKey(@Param("areaid") Integer areaid, @Param("gid") Integer gid);

    int insert(NetbarArea record);

    int insertSelective(NetbarArea record);

    NetbarArea selectByPrimaryKey(@Param("areaid") Integer areaid, @Param("gid") Integer gid);

    int updateByPrimaryKeySelective(NetbarArea record);

    int updateByPrimaryKey(NetbarArea record);
}