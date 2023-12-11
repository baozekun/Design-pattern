package com.bzk.designpattern.structuralmode.proxy.dynamicproxy.cglibdynamicproxy.fastclass;

import org.springframework.cglib.reflect.FastClass;

import java.lang.reflect.InvocationTargetException;

public class FastClassDemo {
    public static void main(String[] args) throws InvocationTargetException {
        IHelloService helloService = new HelloServiceImpl();
        FastClass fastClass = FastClass.create(HelloServiceImpl.class);
        int say = fastClass.getIndex("say",new Class[]{});
        Object invoke = fastClass.invoke(say, helloService, null);
    }

}
