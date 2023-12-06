package com.bzk.designpattern.abstractfactory.factory.impl;

import com.bzk.designpattern.abstractfactory.factory.FactoryInterface;
import com.bzk.designpattern.abstractfactory.goods.Charger;
import com.bzk.designpattern.abstractfactory.goods.Phone;
import com.bzk.designpattern.abstractfactory.goods.impl.HuaweiChargerImpl;
import com.bzk.designpattern.abstractfactory.goods.impl.HuaweiPhoneImpl;

public class HuaweiFactory implements FactoryInterface {
    @Override
    public Phone getPhone() {
        return new HuaweiPhoneImpl();
    }

    @Override
    public Charger getCharger() {
        return new HuaweiChargerImpl();
    }
}
