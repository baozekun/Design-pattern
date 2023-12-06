package com.bzk.designpattern.simplefactory.impl;

import com.bzk.designpattern.simplefactory.abstractFather.abstractclassimpl.EmailAbstract;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoogleEmailImpl extends EmailAbstract {
    @Override
    public void send(String msg) {
        log.info(msg);
    }

    @Override
    public void sendGoogle(String msg) {
        log.info(msg);
    }
}
