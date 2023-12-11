package com.bzk.designpattern.structuralmode.proxy.dynamicproxy.jdkdynamicproxy;

import java.lang.reflect.Proxy;

public class JdkProxyClient {
    public static void main(String[] args) {
        IBusinessService businessService = new BusinessServiceImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(businessService);

        IBusinessService proxyInstance = (IBusinessService) Proxy.newProxyInstance(
                businessService.getClass().getClassLoader(),
                businessService.getClass().getInterfaces(),
                myInvocationHandler);

        proxyInstance.businessMethod();


    }
}
