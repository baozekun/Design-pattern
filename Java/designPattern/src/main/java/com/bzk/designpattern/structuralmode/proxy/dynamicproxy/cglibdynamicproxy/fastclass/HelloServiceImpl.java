package com.bzk.designpattern.structuralmode.proxy.dynamicproxy.cglibdynamicproxy.fastclass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloServiceImpl implements IHelloService{
    @Override
    public void say() {
        log.info("Hello");
    }
}
