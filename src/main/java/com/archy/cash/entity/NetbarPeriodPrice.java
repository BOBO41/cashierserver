package com.archy.cash.entity;

public class NetbarPeriodPrice {
    private Integer id;

    private Integer gid;

    private Integer regionid;

    private Integer typeid;

    private Float starttime;

    private Float endtime;

    private Float price;

    private Integer deleteflag;

    private Integer isroom;

    private Integer isperiodname;

    private String periodname;

    private Boolean bytype;

    private Boolean ifclientuse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getRegionid() {
        return regionid;
    }

    public void setRegionid(Integer regionid) {
        this.regionid = regionid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Float getStarttime() {
        return starttime;
    }

    public void setStarttime(Float starttime) {
        this.starttime = starttime;
    }

    public Float getEndtime() {
        return endtime;
    }

    public void setEndtime(Float endtime) {
        this.endtime = endtime;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }

    public Integer getIsroom() {
        return isroom;
    }

    public void setIsroom(Integer isroom) {
        this.isroom = isroom;
    }

    public Integer getIsperiodname() {
        return isperiodname;
    }

    public void setIsperiodname(Integer isperiodname) {
        this.isperiodname = isperiodname;
    }

    public String getPeriodname() {
        return periodname;
    }

    public void setPeriodname(String periodname) {
        this.periodname = periodname == null ? null : periodname.trim();
    }

    public Boolean getBytype() {
        return bytype;
    }

    public void setBytype(Boolean bytype) {
        this.bytype = bytype;
    }

    public Boolean getIfclientuse() {
        return ifclientuse;
    }

    public void setIfclientuse(Boolean ifclientuse) {
        this.ifclientuse = ifclientuse;
    }
}