package com.bzk.designpattern.singleton;

/**
 * 单例模式
 * 静态内部类 PLUS (借鉴枚举单例实现方式)
 */
public class StaticInnerClassPlus {
    private StaticInnerClassPlus(){
        if(LayzInner.singleton != null){
            throw new RuntimeException("不能够进行反射！");
        }
    }

    private static class LayzInner{
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return LayzInner.singleton;
    }
}
