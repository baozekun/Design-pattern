package com.bzk.designpattern.structuralmode.composite;

import lombok.extern.slf4j.Slf4j;

/**
 * 抽象 Human 类
 */
@Slf4j
public abstract class AbstractHuman {

    public void say() {
        log.info("我是抽象类");
    }
}
