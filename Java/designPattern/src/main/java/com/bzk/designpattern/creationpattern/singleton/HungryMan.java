package com.bzk.designpattern.creationpattern.singleton;

/**
 * 单例模式
 * 饿汉式
 * 将实例化对象直接作为静态类属性，通过统一入口获取实例化对象
 */
public class HungryMan {

    private static final HungryMan INSTANCE = new HungryMan();


    private static final HungryMan INSTANCE2;
    static {
        INSTANCE2 = new HungryMan();
    }

    private HungryMan() {
    }

    public static HungryMan getInstance(){
        return INSTANCE;
    }

    public static HungryMan getInstance2(){
        return INSTANCE2;
    }
}
