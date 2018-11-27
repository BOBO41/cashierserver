package com.archy.cash.service;

import java.util.*;

import com.archy.cash.entity.NetbarArea;
import com.archy.cash.entity.NetbarMachine;
import com.archy.cash.entity.NetbarMember;
import com.archy.cash.entity.NetbarMemberType;
import org.springframework.stereotype.Service;

@Service
public class CashServer {


    private Map<Long, NetbarMember> onlineMember = new HashMap<Long,NetbarMember>();


    private Map<String, NetbarMachine> machineMap = new HashMap<String,NetbarMachine>();


    private Map<String, NetbarArea> areaMap = new HashMap<String, NetbarArea>();


    private Map<Integer, NetbarMemberType> netbarMemberTypeMap = new HashMap<Integer, NetbarMemberType>();





}
