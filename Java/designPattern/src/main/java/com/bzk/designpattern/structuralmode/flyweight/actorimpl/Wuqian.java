package com.bzk.designpattern.structuralmode.flyweight.actorimpl;

import com.bzk.designpattern.structuralmode.flyweight.Actor;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体享元实现类
 */
@Slf4j
public class Wuqian extends Actor {

    public Wuqian(boolean takeDrugs, boolean derailment, boolean goWhoring) {
        super(takeDrugs, derailment, goWhoring);
    }

    @Override
    public void show() {
        log.info("Name: Wu qian,take Drugs:{},derailment:{},go Whoring:{}",takeDrugs,derailment,goWhoring);
    }
}
