package com.archy.cash.entity.enums;

public enum BillingType {

    WEEK_RATE(1,"单机普通"),
    PERIOD_RATE(2,"单机包时段"),
    DURATION_RATE(3,"单机包时长"),
    END(100,"未定义");

    private int value;
    private String des;

    private BillingType(int v,String d){
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
