package com.bzk.designpattern.structuralmode.composite;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoodImpl {
    AbstractHuman abstractHuman;

    public GoodImpl(AbstractHuman abstractHuman) {
        log.info("我是采用组合方式的实现类的构造方法");
        this.abstractHuman = abstractHuman;
    }

    public void say(){
        abstractHuman.say();
        log.info("我将抽象类作为类属性组合到我的实现类中");
    }
}
