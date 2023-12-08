package com.bzk.designpattern.structuralmode.proxy.staticproxy;

public class StaticProxyClient {
    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy(new BusinessService());
        staticProxy.execute();
    }
}
