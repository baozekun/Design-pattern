package com.bzk.designpattern.creationmode.singleton;

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
