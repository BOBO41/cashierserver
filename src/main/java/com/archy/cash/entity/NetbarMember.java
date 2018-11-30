package com.archy.cash.entity;

import java.util.Date;

public class NetbarMember {

    //base info

    private String account;

    private Integer uid;

    private Integer userid;

    private String membername;

    private Date birthday;

    private Integer sex;

    private String password;

    private String phone;

    private String openid;

    private Integer membertype;

    private Boolean state;

    private Integer creator;

    private Date createdate;

    private Integer lastupdate;

    private Date lastupdatedate;

    private Integer gid;

    private Integer dataversion;

    private String address;

    private Integer cashbalance;

    private Integer basebalance;

    private Integer awardbalance;


    //online info


    public Integer getCashbalance() {
        return cashbalance;
    }

    public void setCashbalance(Integer cashbalance) {
        this.cashbalance = cashbalance;
    }

    public Integer getBasebalance() {
        return basebalance;
    }

    public void setBasebalance(Integer basebalance) {
        this.basebalance = basebalance;
    }

    public Integer getAwardbalance() {
        return awardbalance;
    }

    public void setAwardbalance(Integer awardbalance) {
        this.awardbalance = awardbalance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Integer getMembertype() {
        return membertype;
    }

    public void setMembertype(Integer membertype) {
        this.membertype = membertype;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Integer lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Date getLastupdatedate() {
        return lastupdatedate;
    }

    public void setLastupdatedate(Date lastupdatedate) {
        this.lastupdatedate = lastupdatedate;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getDataversion() {
        return dataversion;
    }

    public void setDataversion(Integer dataversion) {
        this.dataversion = dataversion;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }


}