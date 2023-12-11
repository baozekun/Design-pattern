package com.bzk.designpattern.structuralmode.bridge.abstractlevel;

import com.bzk.designpattern.structuralmode.bridge.impllevel.Text;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AbstractTextImpl extends AbstractText{
    public AbstractTextImpl(Text text) {
        super(text);
    }

    @Override
    public void operation() {
        log.info("扩展抽象化(Refined Abstraction)角色被访问");
        text.appearance();
    }
}
