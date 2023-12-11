package com.bzk.designpattern.structuralmode.facade.subservice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cache {
    private final String CACHE = "8";

    public void getCache(){
        log.info("Cache is {}G",CACHE);
    }
}
