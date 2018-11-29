package com.archy.cash.entity.Enum;

public enum RechargeSource {

    NETBAR_CLIENT(1,"网吧客户端"),
    NETBAR_CASHIER(2,"网吧收银端"),
    PHONE(3,"手机端"),
    END(100,"未知");

    private int value;
    private String des;
    private RechargeSource(int v,String d){
        this.value = v;
        this.des = d;
    }

    public int value(){
        return this.value;
    }

    public String des(){
        return this.des;
    }

    public static RechargeSource valueOf(int value){

        for(RechargeSource e : RechargeSource.values()){
            if(e.value() == value){
                return e;
            }
        }

        return RechargeSource.END;
    }


}
