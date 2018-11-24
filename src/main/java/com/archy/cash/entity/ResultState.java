package com.archy.cash.entity;

public enum ResultState {

    SUCCESS(0,"成功"),
    FAIL(-1,"失败"),
    END(100,"未知");

    private int value;
    private String des;
    private ResultState(int v,String des){
        this.value = v;
        this.des = des;
    }

    public int value(){
        return this.value;
    }

    public String des(){
        return this.des;
    }


}
