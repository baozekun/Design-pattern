package com.bzk.designpattern.structuralmode.bridge;

import com.bzk.designpattern.structuralmode.bridge.abstractlevel.AbstractText;
import com.bzk.designpattern.structuralmode.bridge.abstractlevel.AbstractTextImpl;
import com.bzk.designpattern.structuralmode.bridge.impllevel.ColorImpl;
import com.bzk.designpattern.structuralmode.bridge.impllevel.FontImpl;
import com.bzk.designpattern.structuralmode.bridge.impllevel.Text;

public class BridgeClient {
    public static void main(String[] args) {
        Text text = new FontImpl();
        AbstractText abstractText = new AbstractTextImpl(text);
        abstractText.operation();
        Text color = new ColorImpl();
        AbstractText abstractText1 = new AbstractTextImpl(color);
        abstractText1.operation();
    }
}
