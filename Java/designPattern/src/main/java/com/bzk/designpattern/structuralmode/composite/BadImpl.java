package com.bzk.designpattern.structuralmode.composite;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BadImpl extends AbstractHuman {

    @Override
    public void say() {
        log.info("我继承了抽象类，是一个单继承的实现类");
    }
}
