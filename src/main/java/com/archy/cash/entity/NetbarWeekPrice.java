package com.archy.cash.entity;

public class NetbarWeekPrice {
    private Integer id;

    private Integer gid;

    private Integer areaid;

    private Integer typeid;

    private Integer ignoretime;

    private Float startprice;

    private Float mincostprice;

    private Integer reservd;

    private String price;

    private Float weekprices[];

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

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getIgnoretime() {
        return ignoretime;
    }

    public void setIgnoretime(Integer ignoretime) {
        this.ignoretime = ignoretime;
    }

    public Float getStartprice() {
        return startprice;
    }

    public void setStartprice(Float startprice) {
        this.startprice = startprice;
    }

    public Float getMincostprice() {
        return mincostprice;
    }

    public void setMincostprice(Float mincostprice) {
        this.mincostprice = mincostprice;
    }

    public Integer getReservd() {
        return reservd;
    }

    public void setReservd(Integer reservd) {
        this.reservd = reservd;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Float[] getWeekprices() {
        return weekprices;
    }

    public float findWeekprice(int week,int hour){
        return weekprices[week*24 + hour];
    }

}