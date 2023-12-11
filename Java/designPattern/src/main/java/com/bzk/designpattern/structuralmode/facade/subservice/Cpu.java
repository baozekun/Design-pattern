package com.bzk.designpattern.structuralmode.facade.subservice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cpu {

    private final String CPU = "4";

    public void getCpu(){
        log.info("CPU is {} core",CPU);
    }
}
