package com.archy.cash.entity;

import java.math.BigDecimal;
import java.util.Date;

public class NetbarBaseInfo {
    private Integer gid;

    private Integer netbarname;

    private Boolean ifchain;

    private Integer tid;

    private Byte proviceid;

    private Integer cityid;

    private Integer districtid;

    private String address;

    private Integer pcnum;

    private String principal;

    private String thephone;

    private Date setuptime;

    private Integer dataversion;

    private BigDecimal lat;

    private BigDecimal lng;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getNetbarname() {
        return netbarname;
    }

    public void setNetbarname(Integer netbarname) {
        this.netbarname = netbarname;
    }

    public Boolean getIfchain() {
        return ifchain;
    }

    public void setIfchain(Boolean ifchain) {
        this.ifchain = ifchain;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Byte getProviceid() {
        return proviceid;
    }

    public void setProviceid(Byte proviceid) {
        this.proviceid = proviceid;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getDistrictid() {
        return districtid;
    }

    public void setDistrictid(Integer districtid) {
        this.districtid = districtid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getPcnum() {
        return pcnum;
    }

    public void setPcnum(Integer pcnum) {
        this.pcnum = pcnum;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getThephone() {
        return thephone;
    }

    public void setThephone(String thephone) {
        this.thephone = thephone == null ? null : thephone.trim();
    }

    public Date getSetuptime() {
        return setuptime;
    }

    public void setSetuptime(Date setuptime) {
        this.setuptime = setuptime;
    }

    public Integer getDataversion() {
        return dataversion;
    }

    public void setDataversion(Integer dataversion) {
        this.dataversion = dataversion;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }
}