package com.bzk.designpattern.structuralmode.adapter;

import com.bzk.designpattern.structuralmode.adapter.demo.Adaptee;
import com.bzk.designpattern.structuralmode.adapter.demo.Target;
import lombok.extern.slf4j.Slf4j;

/**
 * 类适配器，单继承 被适配对象，限制了扩展性
 */
@Slf4j
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void socket() {
        appendTypeA();
        appendTypeB();
        typeC();//被代理对象的方法
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
