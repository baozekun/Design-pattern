package com.bzk.designpattern.structuralmode.decorate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        append();
    }

    private void append() {
        log.info("具体装饰类实现中的附加逻辑");
    }
}
