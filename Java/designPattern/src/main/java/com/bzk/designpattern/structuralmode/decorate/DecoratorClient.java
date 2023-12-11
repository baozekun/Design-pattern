package com.bzk.designpattern.structuralmode.decorate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorClient {
    public static void main(String[] args) {
        log.info("纯构件具体实现");
        Component p = new ConcreteComponent();
        p.operation();
        log.info("使用装饰模式实现");
        Component p1 = new ConcreteDecorator(p);
        p1.operation();
    }
}
