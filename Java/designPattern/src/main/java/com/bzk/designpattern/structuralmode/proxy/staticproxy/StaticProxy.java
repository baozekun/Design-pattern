package com.bzk.designpattern.structuralmode.proxy.staticproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StaticProxy implements BusinessInterface{

    private BusinessInterface businessInterface;

    public StaticProxy(BusinessService businessService) {
        this.businessInterface = businessService;
    }

    private void beforeProcess(){
        log.info("代理类前置增强处理");
    }

    @Override
    public void process() {
        log.info("代理类核心业务调用处理start");
        businessInterface.process();
        log.info("代理类核心业务调用处理end");
    }

    private void afterProcess(){
        log.info("代理类后置增强处理");
    }

    public void execute() {
        beforeProcess();
        process();
        afterProcess();
    }
}
