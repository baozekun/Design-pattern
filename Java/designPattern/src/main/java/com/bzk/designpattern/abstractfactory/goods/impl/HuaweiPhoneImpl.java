package com.bzk.designpattern.abstractfactory.goods.impl;

import com.bzk.designpattern.abstractfactory.goods.Phone;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HuaweiPhoneImpl implements Phone {
    @Override
    public void call() {
        log.info("Making a call on my HUAWEI");
    }
}
