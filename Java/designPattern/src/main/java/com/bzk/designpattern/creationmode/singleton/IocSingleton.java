package com.bzk.designpattern.creationmode.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 单例模式
 * 容器式单例，Spring IOC实现Bean管理的方式
 * Spring ioc 单例 是懒汉式 枚举上的升级
 */
public class IocSingleton {
    private IocSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) {
        synchronized (ioc) {
            if (ioc.containsKey(className)) {
                Object o = null;
                try {
                    o = Class.forName(className).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return o;
            } else {
                return ioc.get(className);
            }
        }
    }
}
