package com.bzk.designpattern.structuralmode.proxy.staticproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BusinessService implements BusinessInterface{
    @Override
    public void process() {
        log.info("这里是业务的具体是具体实现逻辑");
    }
}
