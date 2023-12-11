package com.bzk.designpattern.structuralmode.proxy.dynamicproxy.jdkdynamicproxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 实现 InvocationHandler 接口，编写自定义调用处理器
 */
@Slf4j
public class MyInvocationHandler implements InvocationHandler {

    /**
     * 内置对象，代理方法执行时使用
     */
    private Object target;

    public MyInvocationHandler(Object object) {
        this.target = object;
    }

    /**
     * 调用处理器核心方法
     * @param proxy the proxy instance that the method was invoked on
     *
     * @param method the {@code Method} instance corresponding to
     * the interface method invoked on the proxy instance.  The declaring
     * class of the {@code Method} object will be the interface that
     * the method was declared in, which may be a superinterface of the
     * proxy interface that the proxy class inherits the method through.
     *
     * @param args an array of objects containing the values of the
     * arguments passed in the method invocation on the proxy instance,
     * or {@code null} if interface method takes no arguments.
     * Arguments of primitive types are wrapped in instances of the
     * appropriate primitive wrapper class, such as
     * {@code java.lang.Integer} or {@code java.lang.Boolean}.
     *
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("这里可以添加前置增强处理");
        Object invoke = method.invoke(target, args);
        log.info("这里可以添加后置增强处理");
        return invoke;
    }
}
