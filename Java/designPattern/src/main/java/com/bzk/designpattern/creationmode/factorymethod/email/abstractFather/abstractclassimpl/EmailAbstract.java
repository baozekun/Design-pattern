package com.bzk.designpattern.creationmode.factorymethod.email.abstractFather.abstractclassimpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailAbstract {

    /* 单方法工厂模式 */
    public void send(String msg){
        log.info("EmailAbstract do nothing");
    }

    /* 多方法工厂模式 */
    public void sendTencent(String msg){
        log.info("EmailAbstract do nothing");
    }
    public void sendWangYi(String msg){
        log.info("EmailAbstract do nothing");
    }
    public void sendGoogle(String msg){
        log.info("EmailAbstract do nothing");
    }

}
