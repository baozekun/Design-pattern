package com.bzk.designpattern.creationmode.singleton;

/**
 * 单例模式
 * 静态内部类
 */
public class StaticInnerClass {
    private StaticInnerClass() {
    }

    private static class LazyInner {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance(){
        return LazyInner.INSTANCE;
    }
}
