package com.bzk.designpattern.structuralmode.proxy.dynamicproxy.jdkdynamicproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BusinessServiceImpl implements IBusinessService{
    @Override
    public void businessMethod() {
        log.info("这里是业务执行的核心方法");
    }
}
