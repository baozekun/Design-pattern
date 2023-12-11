package com.bzk.designpattern.structuralmode.decorate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteComponent implements Component{



    public ConcreteComponent() {
        log.info("创建具体构件");
    }

    @Override
    public void operation() {
        log.info("具体构件的核心实现");
    }
}
