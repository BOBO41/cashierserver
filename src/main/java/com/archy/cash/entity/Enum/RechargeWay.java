package com.archy.cash.entity.Enum;

public enum RechargeWay {

    CASH(1,"现金"),
    WECHAT(2,"微信支付"),
    ALIPAY(3,"支付宝"),
    END(100,"未知");

    private int value;
    private String des;
    private RechargeWay(int value,String des){
        this.value = value;
        this.des = des;
    }

    public int value(){
        return this.value;
    }

    public String des(){
        return this.des;
    }

    public static RechargeWay valueOf(int v){

        for(RechargeWay way : RechargeWay.values()){
            if(way.value() == v){
                return way;
            }
        }

        return RechargeWay.END;
    }

}
