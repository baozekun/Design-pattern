package com.bzk.designpattern.abstractfactory.goods.impl;

import com.bzk.designpattern.abstractfactory.goods.Charger;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IPhoneChargerImpl implements Charger {
    @Override
    public void charge() {
        log.info("IPhone starts charging");
    }
}
