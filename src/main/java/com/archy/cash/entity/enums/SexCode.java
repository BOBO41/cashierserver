package com.archy.cash.entity.enums;

public enum SexCode {

    MALE(0,"男"),
    FEMALE(1,"女"),
    END(100,"未知");

    private int value;
    private String des;
    private SexCode(int v,String d){
        this.value = v;
        this.des = d;
    }

    public int value(){
        return this.value;
    }

    public String des(){
        return this.des;
    }

    public static SexCode valueOf(int v){

        for(SexCode item : SexCode.values()){
            if(item.value == v){
                return item;
            }
        }

        return SexCode.END;
    }

}
