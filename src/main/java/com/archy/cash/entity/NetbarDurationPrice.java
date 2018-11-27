package com.archy.cash.entity;

public class NetbarDurationPrice {
    private Integer id;

    private Integer gid;

    private Integer regionid;

    private Integer typeid;

    private Integer durationtime;

    private Float validbegintimestamp;

    private Float validendtimestamp;

    private Float price;

    private Integer roomtype;

    private Integer deleteflag;

    private Integer isdurationname;

    private String durationname;

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

    public Integer getDurationtime() {
        return durationtime;
    }

    public void setDurationtime(Integer durationtime) {
        this.durationtime = durationtime;
    }

    public Float getValidbegintimestamp() {
        return validbegintimestamp;
    }

    public void setValidbegintimestamp(Float validbegintimestamp) {
        this.validbegintimestamp = validbegintimestamp;
    }

    public Float getValidendtimestamp() {
        return validendtimestamp;
    }

    public void setValidendtimestamp(Float validendtimestamp) {
        this.validendtimestamp = validendtimestamp;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(Integer roomtype) {
        this.roomtype = roomtype;
    }

    public Integer getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }

    public Integer getIsdurationname() {
        return isdurationname;
    }

    public void setIsdurationname(Integer isdurationname) {
        this.isdurationname = isdurationname;
    }

    public String getDurationname() {
        return durationname;
    }

    public void setDurationname(String durationname) {
        this.durationname = durationname == null ? null : durationname.trim();
    }
}