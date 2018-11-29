package com.archy.cash.entity;

import java.util.Date;

public class NetbarRechargeCompaign {
    private Integer rechargecompaignid;

    private Integer membertype;

    private Integer rechargefee;

    private Integer additionalfee;

    private Boolean state;

    private Date begindate;

    private Date enddate;

    private Integer dataversion;

    private Integer gid;

    public Integer getRechargecompaignid() {
        return rechargecompaignid;
    }

    public void setRechargecompaignid(Integer rechargecompaignid) {
        this.rechargecompaignid = rechargecompaignid;
    }

    public Integer getMembertype() {
        return membertype;
    }

    public void setMembertype(Integer membertype) {
        this.membertype = membertype;
    }

    public Integer getRechargefee() {
        return rechargefee;
    }

    public void setRechargefee(Integer rechargefee) {
        this.rechargefee = rechargefee;
    }

    public Integer getAdditionalfee() {
        return additionalfee;
    }

    public void setAdditionalfee(Integer additionalfee) {
        this.additionalfee = additionalfee;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getDataversion() {
        return dataversion;
    }

    public void setDataversion(Integer dataversion) {
        this.dataversion = dataversion;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }
}