package com.kuilian.books.result;

public class ResultVO <T>{
    private int code;
    private String msg;
    public ResultVO(int code,String msg){
        this.code=code;
        this.msg=msg;
    }

}
