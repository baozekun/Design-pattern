package com.bzk.designpattern.creationmode.singleton;

/**
 * 单例模式
 * ThreadLocal单例
 * 局部单例模式：某一个线程里唯一
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {
    }

    private static ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL_SINGLETON = new ThreadLocal<>();

    public static ThreadLocalSingleton getInstance() {
        if(THREAD_LOCAL_SINGLETON.get()==null){
            THREAD_LOCAL_SINGLETON.set(new ThreadLocalSingleton());
        }
        return THREAD_LOCAL_SINGLETON.get();
    }
}
