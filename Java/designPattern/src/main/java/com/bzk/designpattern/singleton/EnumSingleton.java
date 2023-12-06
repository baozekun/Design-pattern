package com.bzk.designpattern.singleton;

/**
 * 单例模式
 * 枚举
 */
public enum EnumSingleton {
    INSTANCE;
    private Singleton singleton;
    EnumSingleton(){
        singleton = new Singleton();
    }
    public Singleton getSingleton(){
        return singleton;
    }
}
