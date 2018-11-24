package com.archy.cash.entity;

import org.omg.PortableInterceptor.SUCCESSFUL;

public class Result {

    public Result(){
        this.state = ResultState.SUCCESS.value();
        this.data = null;
    }

    public Result(ResultState state,Object data){
        this.state = state.value();
        this.data = data;
    }

    private int state;

    private Object data;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
