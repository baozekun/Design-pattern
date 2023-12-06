package com.bzk.designpattern.creationpattern.simplefactory.abstractFather.interfaceimpl;

public interface EmailInterface {
    /* 单方法工厂模式 */
    void send(String msg);


    /* 多方法工厂模式 */
    void sendTencent(String msg);
    void sendWangYi(String msg);
    void sendGoogle(String msg);
}
