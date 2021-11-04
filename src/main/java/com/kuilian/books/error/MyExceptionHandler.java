package com.kuilian.books.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@ResponseBody
public class MyExceptionHandler {
    @ExceptionHandler(MyException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String,Object> handlerMyException(MyException ex){
        Map<String,Object> rs=new HashMap<>();
        rs.put("msg",ex.getMessage());
        rs.put("erorr type","MyException");
        return rs;
    }

}
