package com.archy.cash.entity;

public class NetbarArea {
    private Integer areaid;

    private Integer gid;

    private String areaname;

    private Boolean areatype;

    private Integer num;

    private Boolean ifroom;

    private String description;

    private Boolean state;

    private Integer dataversion;

    private String membertypelist;

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public Boolean getAreatype() {
        return areatype;
    }

    public void setAreatype(Boolean areatype) {
        this.areatype = areatype;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Boolean getIfroom() {
        return ifroom;
    }

    public void setIfroom(Boolean ifroom) {
        this.ifroom = ifroom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Integer getDataversion() {
        return dataversion;
    }

    public void setDataversion(Integer dataversion) {
        this.dataversion = dataversion;
    }

    public String getMembertypelist() {
        return membertypelist;
    }

    public void setMembertypelist(String membertypelist) {
        this.membertypelist = membertypelist == null ? null : membertypelist.trim();
    }
}