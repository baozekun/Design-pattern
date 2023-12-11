package com.bzk.designpattern.structuralmode.composite;

public class CompositeClient {
    public static void main(String[] args) {
        AbstractHuman human = new BadImpl();
        human.say();

        GoodImpl good = new GoodImpl(human);
        good.say();
    }
}
