package com.archy.cash.entity.Enum;

public enum RechargeType {

    ACCOUNTCHARGE(1,"账户充值"),
    DEPOSIT(2,"押金充值"),
    END(100,"未定义");

    private int value;
    private String des;
    private RechargeType(int v,String d){
        this.value = v;
        this.des = d;
    }

    public int value(){
        return this.value;
    }

    public String des(){
        return this.des;
    }


}
