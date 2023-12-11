package com.bzk.designpattern.structuralmode.flyweight;

/**
 * 抽象演员享元对象
 */
public abstract class Actor {

    public boolean takeDrugs;//坏行为1

    public boolean derailment;//坏行为2

    public boolean goWhoring;//坏行为3

    public Actor(boolean takeDrugs, boolean derailment, boolean goWhoring) {
        this.takeDrugs = takeDrugs;
        this.derailment = derailment;
        this.goWhoring = goWhoring;
    }

    public abstract void show();
}
