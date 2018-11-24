package com.archy.cash.entity;

public class NetbarMemberType {
    private Integer membertypeplanid;

    private Integer membertypeid;

    private String parastypename;

    private Integer dataversion;

    private Integer gid;

    private Integer theorder;

    public Integer getMembertypeplanid() {
        return membertypeplanid;
    }

    public void setMembertypeplanid(Integer membertypeplanid) {
        this.membertypeplanid = membertypeplanid;
    }

    public Integer getMembertypeid() {
        return membertypeid;
    }

    public void setMembertypeid(Integer membertypeid) {
        this.membertypeid = membertypeid;
    }

    public String getParastypename() {
        return parastypename;
    }

    public void setParastypename(String parastypename) {
        this.parastypename = parastypename == null ? null : parastypename.trim();
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

    public Integer getTheorder() {
        return theorder;
    }

    public void setTheorder(Integer theorder) {
        this.theorder = theorder;
    }
}