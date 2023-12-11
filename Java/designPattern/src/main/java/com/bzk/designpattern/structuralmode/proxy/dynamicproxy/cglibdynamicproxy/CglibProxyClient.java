package com.bzk.designpattern.structuralmode.proxy.dynamicproxy.cglibdynamicproxy;

public class CglibProxyClient {
    public static void main(String[] args) {
        IUserService iUserService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        IUserService proxy = (IUserService) userServiceProxy.createProxy(iUserService);
        proxy.userSay();
    }
}
