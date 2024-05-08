package org.example.common;

/**
 * @description: 自定义业务异常类
 * @author: symphony
 * @create: 2024/05/08
 **/
public class CustomException extends RuntimeException {
    public CustomException(String message){
        super(message);
    }
}
