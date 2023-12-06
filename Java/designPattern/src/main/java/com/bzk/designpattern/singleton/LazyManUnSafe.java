package com.bzk.designpattern.singleton;

/**
 * 单例模式
 * 懒汉式
 * 获取时再实例化
 */
public class LazyManUnSafe {
    private static LazyManUnSafe INSTANCE = null;

    private LazyManUnSafe() {
    }

    public static LazyManUnSafe getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazyManUnSafe();
        }
        return INSTANCE;
    }
}
