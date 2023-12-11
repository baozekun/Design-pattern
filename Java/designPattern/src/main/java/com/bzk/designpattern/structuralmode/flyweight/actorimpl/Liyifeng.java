package com.bzk.designpattern.structuralmode.flyweight.actorimpl;

import com.bzk.designpattern.structuralmode.flyweight.Actor;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体的享元对象实现
 */
@Slf4j
public class Liyifeng extends Actor {


    public Liyifeng(boolean takeDrugs, boolean derailment, boolean goWhoring) {
        super(takeDrugs, derailment, goWhoring);
    }

    @Override
    public void show() {
        log.info("Name: Li yifeng,take Drugs:{},derailment:{},go Whoring:{}",takeDrugs,derailment,goWhoring);
    }
}
