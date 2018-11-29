package com.archy.cash.entity;

import java.math.BigDecimal;
import java.util.Date;

public class NetbarRechargeOrder {
    private Long rechargeorderid;

    private Integer rechargecompaignid;

    private String account;

    private Integer rechargeway;

    private Integer rechargetype;

    private Integer deposit;

    private Integer rechargefee;

    private Integer adwardfee;

    private Boolean state;

    private Integer posaccount;

    private Date rechargedate;

    private Integer dataversion;

    private Integer rechargesource;

    private Integer gid;

    private Date lastupdatedate;

    private Long oldrechargeorderid;

    public Long getRechargeorderid() {
        return rechargeorderid;
    }

    public void setRechargeorderid(Long rechargeorderid) {
        this.rechargeorderid = rechargeorderid;
    }

    public Integer getRechargecompaignid() {
        return rechargecompaignid;
    }

    public void setRechargecompaignid(Integer rechargecompaignid) {
        this.rechargecompaignid = rechargecompaignid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getRechargeway() {
        return rechargeway;
    }

    public void setRechargeway(Integer rechargeway) {
        this.rechargeway = rechargeway;
    }

    public Integer getRechargetype() {
        return rechargetype;
    }

    public void setRechargetype(Integer rechargetype) {
        this.rechargetype = rechargetype;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getRechargefee() {
        return rechargefee;
    }

    public void setRechargefee(Integer rechargefee) {
        this.rechargefee = rechargefee;
    }

    public Integer getAdwardfee() {
        return adwardfee;
    }

    public void setAdwardfee(Integer adwardfee) {
        this.adwardfee = adwardfee;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Integer getPosaccount() {
        return posaccount;
    }

    public void setPosaccount(Integer posaccount) {
        this.posaccount = posaccount;
    }

    public Date getRechargedate() {
        return rechargedate;
    }

    public void setRechargedate(Date rechargedate) {
        this.rechargedate = rechargedate;
    }

    public Integer getDataversion() {
        return dataversion;
    }

    public void setDataversion(Integer dataversion) {
        this.dataversion = dataversion;
    }

    public Integer getRechargesource() {
        return rechargesource;
    }

    public void setRechargesource(Integer rechargesource) {
        this.rechargesource = rechargesource;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Date getLastupdatedate() {
        return lastupdatedate;
    }

    public void setLastupdatedate(Date lastupdatedate) {
        this.lastupdatedate = lastupdatedate;
    }

    public Long getOldrechargeorderid() {
        return oldrechargeorderid;
    }

    public void setOldrechargeorderid(Long oldrechargeorderid) {
        this.oldrechargeorderid = oldrechargeorderid;
    }
}