package com.archy.cash.entity;

import java.util.Date;

public class NetbarUser {
    private Integer netbaruserid;

    private String account;

    private String membername;

    private Date birthday;

    private Boolean sex;

    private String password;

    private String phone;

    private Boolean state;

    private Boolean ifauth;

    private Boolean ifcashierlogin;

    private Integer dataversion;

    private Integer gid;

    private String authorisecode;

    private String roleids;

    private Boolean accountlevel;

    public Integer getNetbaruserid() {
        return netbaruserid;
    }

    public void setNetbaruserid(Integer netbaruserid) {
        this.netbaruserid = netbaruserid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
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

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
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

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getIfauth() {
        return ifauth;
    }

    public void setIfauth(Boolean ifauth) {
        this.ifauth = ifauth;
    }

    public Boolean getIfcashierlogin() {
        return ifcashierlogin;
    }

    public void setIfcashierlogin(Boolean ifcashierlogin) {
        this.ifcashierlogin = ifcashierlogin;
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

    public String getAuthorisecode() {
        return authorisecode;
    }

    public void setAuthorisecode(String authorisecode) {
        this.authorisecode = authorisecode == null ? null : authorisecode.trim();
    }

    public String getRoleids() {
        return roleids;
    }

    public void setRoleids(String roleids) {
        this.roleids = roleids == null ? null : roleids.trim();
    }

    public Boolean getAccountlevel() {
        return accountlevel;
    }

    public void setAccountlevel(Boolean accountlevel) {
        this.accountlevel = accountlevel;
    }
}