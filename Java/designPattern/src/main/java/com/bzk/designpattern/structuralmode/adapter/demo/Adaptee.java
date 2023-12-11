package com.bzk.designpattern.structuralmode.adapter.demo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Adaptee {

    public void typeC(){
        log.info("This is just a type C interface");
    }
}
