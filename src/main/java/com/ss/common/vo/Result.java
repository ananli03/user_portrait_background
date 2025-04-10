package com.ss.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor   //全参构造
@NoArgsConstructor    //无参构造
public class Result<T> {
    private Integer code;  //名称要与前端统一
    private String message;
    private T data;   //返回数据类型不确定

    public static<T> Result<T> success(){
        return new Result<>(20000,"success",null);
    }

    public static<T> Result<T> success(T data){
        return new Result<>(20000,"success",data);
    }

    public static<T> Result<T> success(T data,String message){   //重载方法
        return new Result<>(20000,message,data);
    }

    public static<T> Result<T> success(String message){
        return new Result<>(20000,message,null);
    }

    public static<T> Result<T> fail(){
        return new Result<>(20001,"fail",null);
    }

    public static<T> Result<T> fail(Integer code){
        return new Result<>(code,"fail",null);
    }

    public static<T> Result<T> fail(Integer code,String message){
        return new Result<>(code,message,null);
    }

    public static<T> Result<T> fail(String message){
        return new Result<>(20001,message,null);
    }
}
