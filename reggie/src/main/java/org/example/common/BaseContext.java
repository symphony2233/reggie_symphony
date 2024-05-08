package org.example.common;

/**
 * @description: 基于ThreadLocal封装工具类，用户保存和获取当前登录用户id
 * @author: symphony
 * @create: 2024/05/08
 **/
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();
    /**
     * 设置值
     * @param id
     */
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }
    /**
     * 获取值
     * @return
     */
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
