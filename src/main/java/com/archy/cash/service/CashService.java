package com.archy.cash.service;

import java.util.*;

import com.archy.cash.dao.interfaces.*;
import com.archy.cash.entity.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CashService {

    @Resource
    private NetbarAreaMapper netbarAreaMapper;

    @Resource
    private NetbarMachineMapper netbarMachineMapper;

    @Resource
    private NetbarMemberTypeMapper netbarMemberTypeMapper;

    @Resource
    private NetbarWeekPriceMapper netbarWeekPriceMapper;

    @Resource
    private NetbarPeriodPriceMapper netbarPeriodPriceMapper;

    @Resource
    private NetbarDurationPriceMapper netbarDurationPriceMapper;

    @Resource
    private NetbarExtraCostMapper netbarExtraCostMapper;

    @Resource
    private NetbarBIllingMapper netbarBIllingMapper;

    @Resource
    private NetbarOnlineMapper netbarOnlineMapper;

    private Map<String, NetbarMember> onlineMember = new HashMap<String, NetbarMember>();

    private List<NetbarMachine> machineList = new ArrayList<NetbarMachine>();

    private List<NetbarArea> areaList = new ArrayList<NetbarArea>();

    private List<NetbarMemberType> memberTypeList = new ArrayList<NetbarMemberType>();

    private List<NetbarWeekPrice> weekPriceList = new ArrayList<NetbarWeekPrice>();

    private List<NetbarDurationPrice> durationPriceList = new ArrayList<>();

    private List<NetbarPeriodPrice> periodPriceList = new ArrayList<>();

    private List<NetbarExtraCost> extraCostList = new ArrayList<>();

    private Integer gid;

    public int getGid(){
        return this.gid;
    }

    public void init(Integer gid){

        this.gid = gid;

        this.machineList = this.netbarMachineMapper.selectByGid(gid);

        this.areaList = this.netbarAreaMapper.selectByGid(gid);

        this.memberTypeList = this.netbarMemberTypeMapper.selectByGid(gid);

        this.weekPriceList = this.netbarWeekPriceMapper.selectByGid(gid);

        this.durationPriceList = this.netbarDurationPriceMapper.selectByGid(gid);

        this.periodPriceList = this.netbarPeriodPriceMapper.selectByGid(gid);

        this.extraCostList = this.netbarExtraCostMapper.selectByGid(gid);

    }

    public NetbarMember findByAccount(String account){
        return this.onlineMember.get(account);
    }

    public NetbarMemberType findMemberType(Integer typeId){
        for(NetbarMemberType type : this.memberTypeList){
            if(type.getMembertypeid().intValue() == typeId.intValue()){
                return type;
            }
        }
        return null;
    }


    public void tick(){



    }



}
