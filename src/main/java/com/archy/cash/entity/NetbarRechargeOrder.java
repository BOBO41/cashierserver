package com.archy.cash.entity;

import java.math.BigDecimal;
import java.util.Date;

public class NetbarRechargeOrder {
    private Long rechargeorderid;

    private Integer rechargecompaignid;

    private Long memberid;

    private Boolean rechargeway;

    private Boolean rechargetype;

    private BigDecimal deposit;

    private BigDecimal rechargefee;

    private BigDecimal adwardfee;

    private Boolean state;

    private Integer posaccount;

    private Date rechargedate;

    private Integer dataversion;

    private Boolean rechargesource;

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

    public Long getMemberid() {
        return memberid;
    }

    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    public Boolean getRechargeway() {
        return rechargeway;
    }

    public void setRechargeway(Boolean rechargeway) {
        this.rechargeway = rechargeway;
    }

    public Boolean getRechargetype() {
        return rechargetype;
    }

    public void setRechargetype(Boolean rechargetype) {
        this.rechargetype = rechargetype;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public BigDecimal getRechargefee() {
        return rechargefee;
    }

    public void setRechargefee(BigDecimal rechargefee) {
        this.rechargefee = rechargefee;
    }

    public BigDecimal getAdwardfee() {
        return adwardfee;
    }

    public void setAdwardfee(BigDecimal adwardfee) {
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

    public Boolean getRechargesource() {
        return rechargesource;
    }

    public void setRechargesource(Boolean rechargesource) {
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