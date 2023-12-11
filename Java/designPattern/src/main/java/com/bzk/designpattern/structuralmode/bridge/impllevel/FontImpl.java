package com.bzk.designpattern.structuralmode.bridge.impllevel;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体实现
 */
@Slf4j
public class FontImpl implements Text{
    @Override
    public void appearance() {
        log.info("This text`s font is microsoft black");
    }
}
