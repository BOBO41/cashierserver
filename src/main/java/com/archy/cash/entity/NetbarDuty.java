package com.archy.cash.entity;

import java.math.BigDecimal;
import java.util.Date;

public class NetbarDuty {
    private Integer dutyid;

    private Integer shiftid;

    private BigDecimal currentsum;

    private BigDecimal currentcash;

    private BigDecimal currentdeliver;

    private BigDecimal currentreserve;

    private Date dutydate;

    private Date dutybegintime;

    private Date dutyendtime;

    private Boolean state;

    private String remark;

    private Integer dataversion;

    private Integer gid;

    private Boolean generatefrom;

    private Integer nextshiftid;

    private Integer currentnetbaruserid;

    private Integer nextnetbaruserid;

    private Date submittime;

    private BigDecimal totalincome;

    private BigDecimal totalconsume;

    private BigDecimal totalattendance;

    private BigDecimal goodstotalincome;

    private Integer newmembernum;

    private BigDecimal turnoverratio;

    private Integer onlinetimes;

    private Integer onlinemembers;

    private Integer internettimes;

    private BigDecimal adwardtotal;

    private BigDecimal coupondeduction;

    private String shiftname;

    private String currentname;

    private String nextshiftname;

    private String nextname;

    private BigDecimal lastreserve;

    public Integer getDutyid() {
        return dutyid;
    }

    public void setDutyid(Integer dutyid) {
        this.dutyid = dutyid;
    }

    public Integer getShiftid() {
        return shiftid;
    }

    public void setShiftid(Integer shiftid) {
        this.shiftid = shiftid;
    }

    public BigDecimal getCurrentsum() {
        return currentsum;
    }

    public void setCurrentsum(BigDecimal currentsum) {
        this.currentsum = currentsum;
    }

    public BigDecimal getCurrentcash() {
        return currentcash;
    }

    public void setCurrentcash(BigDecimal currentcash) {
        this.currentcash = currentcash;
    }

    public BigDecimal getCurrentdeliver() {
        return currentdeliver;
    }

    public void setCurrentdeliver(BigDecimal currentdeliver) {
        this.currentdeliver = currentdeliver;
    }

    public BigDecimal getCurrentreserve() {
        return currentreserve;
    }

    public void setCurrentreserve(BigDecimal currentreserve) {
        this.currentreserve = currentreserve;
    }

    public Date getDutydate() {
        return dutydate;
    }

    public void setDutydate(Date dutydate) {
        this.dutydate = dutydate;
    }

    public Date getDutybegintime() {
        return dutybegintime;
    }

    public void setDutybegintime(Date dutybegintime) {
        this.dutybegintime = dutybegintime;
    }

    public Date getDutyendtime() {
        return dutyendtime;
    }

    public void setDutyendtime(Date dutyendtime) {
        this.dutyendtime = dutyendtime;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Boolean getGeneratefrom() {
        return generatefrom;
    }

    public void setGeneratefrom(Boolean generatefrom) {
        this.generatefrom = generatefrom;
    }

    public Integer getNextshiftid() {
        return nextshiftid;
    }

    public void setNextshiftid(Integer nextshiftid) {
        this.nextshiftid = nextshiftid;
    }

    public Integer getCurrentnetbaruserid() {
        return currentnetbaruserid;
    }

    public void setCurrentnetbaruserid(Integer currentnetbaruserid) {
        this.currentnetbaruserid = currentnetbaruserid;
    }

    public Integer getNextnetbaruserid() {
        return nextnetbaruserid;
    }

    public void setNextnetbaruserid(Integer nextnetbaruserid) {
        this.nextnetbaruserid = nextnetbaruserid;
    }

    public Date getSubmittime() {
        return submittime;
    }

    public void setSubmittime(Date submittime) {
        this.submittime = submittime;
    }

    public BigDecimal getTotalincome() {
        return totalincome;
    }

    public void setTotalincome(BigDecimal totalincome) {
        this.totalincome = totalincome;
    }

    public BigDecimal getTotalconsume() {
        return totalconsume;
    }

    public void setTotalconsume(BigDecimal totalconsume) {
        this.totalconsume = totalconsume;
    }

    public BigDecimal getTotalattendance() {
        return totalattendance;
    }

    public void setTotalattendance(BigDecimal totalattendance) {
        this.totalattendance = totalattendance;
    }

    public BigDecimal getGoodstotalincome() {
        return goodstotalincome;
    }

    public void setGoodstotalincome(BigDecimal goodstotalincome) {
        this.goodstotalincome = goodstotalincome;
    }

    public Integer getNewmembernum() {
        return newmembernum;
    }

    public void setNewmembernum(Integer newmembernum) {
        this.newmembernum = newmembernum;
    }

    public BigDecimal getTurnoverratio() {
        return turnoverratio;
    }

    public void setTurnoverratio(BigDecimal turnoverratio) {
        this.turnoverratio = turnoverratio;
    }

    public Integer getOnlinetimes() {
        return onlinetimes;
    }

    public void setOnlinetimes(Integer onlinetimes) {
        this.onlinetimes = onlinetimes;
    }

    public Integer getOnlinemembers() {
        return onlinemembers;
    }

    public void setOnlinemembers(Integer onlinemembers) {
        this.onlinemembers = onlinemembers;
    }

    public Integer getInternettimes() {
        return internettimes;
    }

    public void setInternettimes(Integer internettimes) {
        this.internettimes = internettimes;
    }

    public BigDecimal getAdwardtotal() {
        return adwardtotal;
    }

    public void setAdwardtotal(BigDecimal adwardtotal) {
        this.adwardtotal = adwardtotal;
    }

    public BigDecimal getCoupondeduction() {
        return coupondeduction;
    }

    public void setCoupondeduction(BigDecimal coupondeduction) {
        this.coupondeduction = coupondeduction;
    }

    public String getShiftname() {
        return shiftname;
    }

    public void setShiftname(String shiftname) {
        this.shiftname = shiftname == null ? null : shiftname.trim();
    }

    public String getCurrentname() {
        return currentname;
    }

    public void setCurrentname(String currentname) {
        this.currentname = currentname == null ? null : currentname.trim();
    }

    public String getNextshiftname() {
        return nextshiftname;
    }

    public void setNextshiftname(String nextshiftname) {
        this.nextshiftname = nextshiftname == null ? null : nextshiftname.trim();
    }

    public String getNextname() {
        return nextname;
    }

    public void setNextname(String nextname) {
        this.nextname = nextname == null ? null : nextname.trim();
    }

    public BigDecimal getLastreserve() {
        return lastreserve;
    }

    public void setLastreserve(BigDecimal lastreserve) {
        this.lastreserve = lastreserve;
    }
}