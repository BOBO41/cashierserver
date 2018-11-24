package com.archy.cash.entity;

import java.math.BigDecimal;
import java.util.Date;

public class NetbarBIlling {
    private Long billingid;

    private Integer gid;

    private Integer tariffconfigid;

    private Integer ruleid;

    private Date starttime;

    private Date endtime;

    private Date thedate;

    private Integer tariffdataversion;

    private Boolean tarifftype;

    private Boolean ratiocostbase;

    private Boolean ratiocostaward;

    private BigDecimal discount;

    private BigDecimal periodstarttime;

    private BigDecimal periodendtime;

    private Date lastcosttimestamp;

    private Date nextcosttimestamp;

    private Date maxendtimestamp;

    private BigDecimal currentcostbase;

    private BigDecimal currentcostaward;

    private BigDecimal currentcosttemp;

    private BigDecimal allhadcost;

    private Integer ignoretime;

    private BigDecimal startprice;

    private BigDecimal hourprice;

    private Integer wholetimestamp;

    private BigDecimal startcost;

    private Boolean checkstart;

    private Boolean periodorder;

    private Long memberid;

    private Boolean roomowner;

    private BigDecimal additionalfee;

    private Long onlineid;

    public Long getBillingid() {
        return billingid;
    }

    public void setBillingid(Long billingid) {
        this.billingid = billingid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getTariffconfigid() {
        return tariffconfigid;
    }

    public void setTariffconfigid(Integer tariffconfigid) {
        this.tariffconfigid = tariffconfigid;
    }

    public Integer getRuleid() {
        return ruleid;
    }

    public void setRuleid(Integer ruleid) {
        this.ruleid = ruleid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getThedate() {
        return thedate;
    }

    public void setThedate(Date thedate) {
        this.thedate = thedate;
    }

    public Integer getTariffdataversion() {
        return tariffdataversion;
    }

    public void setTariffdataversion(Integer tariffdataversion) {
        this.tariffdataversion = tariffdataversion;
    }

    public Boolean getTarifftype() {
        return tarifftype;
    }

    public void setTarifftype(Boolean tarifftype) {
        this.tarifftype = tarifftype;
    }

    public Boolean getRatiocostbase() {
        return ratiocostbase;
    }

    public void setRatiocostbase(Boolean ratiocostbase) {
        this.ratiocostbase = ratiocostbase;
    }

    public Boolean getRatiocostaward() {
        return ratiocostaward;
    }

    public void setRatiocostaward(Boolean ratiocostaward) {
        this.ratiocostaward = ratiocostaward;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getPeriodstarttime() {
        return periodstarttime;
    }

    public void setPeriodstarttime(BigDecimal periodstarttime) {
        this.periodstarttime = periodstarttime;
    }

    public BigDecimal getPeriodendtime() {
        return periodendtime;
    }

    public void setPeriodendtime(BigDecimal periodendtime) {
        this.periodendtime = periodendtime;
    }

    public Date getLastcosttimestamp() {
        return lastcosttimestamp;
    }

    public void setLastcosttimestamp(Date lastcosttimestamp) {
        this.lastcosttimestamp = lastcosttimestamp;
    }

    public Date getNextcosttimestamp() {
        return nextcosttimestamp;
    }

    public void setNextcosttimestamp(Date nextcosttimestamp) {
        this.nextcosttimestamp = nextcosttimestamp;
    }

    public Date getMaxendtimestamp() {
        return maxendtimestamp;
    }

    public void setMaxendtimestamp(Date maxendtimestamp) {
        this.maxendtimestamp = maxendtimestamp;
    }

    public BigDecimal getCurrentcostbase() {
        return currentcostbase;
    }

    public void setCurrentcostbase(BigDecimal currentcostbase) {
        this.currentcostbase = currentcostbase;
    }

    public BigDecimal getCurrentcostaward() {
        return currentcostaward;
    }

    public void setCurrentcostaward(BigDecimal currentcostaward) {
        this.currentcostaward = currentcostaward;
    }

    public BigDecimal getCurrentcosttemp() {
        return currentcosttemp;
    }

    public void setCurrentcosttemp(BigDecimal currentcosttemp) {
        this.currentcosttemp = currentcosttemp;
    }

    public BigDecimal getAllhadcost() {
        return allhadcost;
    }

    public void setAllhadcost(BigDecimal allhadcost) {
        this.allhadcost = allhadcost;
    }

    public Integer getIgnoretime() {
        return ignoretime;
    }

    public void setIgnoretime(Integer ignoretime) {
        this.ignoretime = ignoretime;
    }

    public BigDecimal getStartprice() {
        return startprice;
    }

    public void setStartprice(BigDecimal startprice) {
        this.startprice = startprice;
    }

    public BigDecimal getHourprice() {
        return hourprice;
    }

    public void setHourprice(BigDecimal hourprice) {
        this.hourprice = hourprice;
    }

    public Integer getWholetimestamp() {
        return wholetimestamp;
    }

    public void setWholetimestamp(Integer wholetimestamp) {
        this.wholetimestamp = wholetimestamp;
    }

    public BigDecimal getStartcost() {
        return startcost;
    }

    public void setStartcost(BigDecimal startcost) {
        this.startcost = startcost;
    }

    public Boolean getCheckstart() {
        return checkstart;
    }

    public void setCheckstart(Boolean checkstart) {
        this.checkstart = checkstart;
    }

    public Boolean getPeriodorder() {
        return periodorder;
    }

    public void setPeriodorder(Boolean periodorder) {
        this.periodorder = periodorder;
    }

    public Long getMemberid() {
        return memberid;
    }

    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    public Boolean getRoomowner() {
        return roomowner;
    }

    public void setRoomowner(Boolean roomowner) {
        this.roomowner = roomowner;
    }

    public BigDecimal getAdditionalfee() {
        return additionalfee;
    }

    public void setAdditionalfee(BigDecimal additionalfee) {
        this.additionalfee = additionalfee;
    }

    public Long getOnlineid() {
        return onlineid;
    }

    public void setOnlineid(Long onlineid) {
        this.onlineid = onlineid;
    }
}