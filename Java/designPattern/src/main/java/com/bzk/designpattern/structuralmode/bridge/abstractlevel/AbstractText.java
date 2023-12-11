package com.bzk.designpattern.structuralmode.bridge.abstractlevel;

import com.bzk.designpattern.structuralmode.bridge.impllevel.Text;

public abstract class AbstractText {
    Text text;

    public AbstractText(Text text) {
        this.text = text;
    }

    public void operation() {

    }
}
