package com.bzk.designpattern.structuralmode.adapter;

import com.bzk.designpattern.structuralmode.adapter.demo.Adaptee;
import com.bzk.designpattern.structuralmode.adapter.demo.Target;

/**
 * 调用客户端
 */
public class Client {
    public static void main(String[] args) {
        //类适配器
        Target target = new ClassAdapter();
        target.socket();

        //对象适配器
        Target target1 = new ObjectAdapter(new Adaptee());
        target1.socket();
    }
}
