package com.bzk.designpattern.structuralmode.adapter;

import com.bzk.designpattern.structuralmode.adapter.demo.Adaptee;
import com.bzk.designpattern.structuralmode.adapter.demo.Target;
import lombok.extern.slf4j.Slf4j;

/**
 * 对象适配器，采用组合模式，将被配置对象最为类成员注入，提高了可扩展性，就是每次都要修改代理类
 */
@Slf4j
public class ObjectAdapter implements Target {

    Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void socket() {
        appendTypeA();
        appendTypeB();
        adaptee.typeC();//被代理对象的方法
        appendTypeD();
        appendTypeE();
    }

    public void appendTypeA(){
        log.info("This is just a type A interface");
    }

    public void appendTypeB(){
        log.info("This is just a type B interface");
    }

    public void appendTypeD(){
        log.info("This is just a type D interface");
    }

    public void appendTypeE(){
        log.info("This is just a type E interface");
    }
}
