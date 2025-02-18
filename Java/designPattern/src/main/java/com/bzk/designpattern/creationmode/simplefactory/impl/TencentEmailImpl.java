package com.bzk.designpattern.creationmode.simplefactory.impl;

import com.bzk.designpattern.creationmode.simplefactory.abstractFather.abstractclassimpl.EmailAbstract;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TencentEmailImpl extends EmailAbstract {
    @Override
    public void send(String msg) {
        log.info(msg);
    }

    @Override
    public void sendTencent(String msg) {
        log.info(msg);
    }
}
