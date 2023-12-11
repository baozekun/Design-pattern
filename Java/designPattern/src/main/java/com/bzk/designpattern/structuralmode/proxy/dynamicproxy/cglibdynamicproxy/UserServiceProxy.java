package com.bzk.designpattern.structuralmode.proxy.dynamicproxy.cglibdynamicproxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Slf4j
public class UserServiceProxy implements MethodInterceptor {
    Object userService;

    public Object createProxy(Object userService) {
        this.userService = userService;
        //Enhancer对象
        Enhancer enhancer = new Enhancer();
        //设置代理目标类
        enhancer.setSuperclass(this.userService.getClass());
        //设置拦截器类
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 在代理类的方法被调用时回调
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.info("前置");
        Object invoke = method.invoke(userService, objects);
        log.info("后置");
        return invoke;
    }
}
