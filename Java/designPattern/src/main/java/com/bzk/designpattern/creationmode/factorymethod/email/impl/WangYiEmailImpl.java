package com.bzk.designpattern.creationmode.factorymethod.email.impl;

import com.bzk.designpattern.creationmode.factorymethod.email.abstractFather.abstractclassimpl.EmailAbstract;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WangYiEmailImpl extends EmailAbstract {

    @Override
    public void send(String msg) {
        log.info(msg);
    }


    @Override
    public void sendWangYi(String msg) {
        log.info(msg);
    }
}
