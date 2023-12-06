package com.bzk.designpattern.creationmode.abstractfactory.goods.impl;

import com.bzk.designpattern.creationmode.abstractfactory.goods.Charger;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IPhoneChargerImpl implements Charger {
    @Override
    public void charge() {
        log.info("IPhone starts charging");
    }
}
