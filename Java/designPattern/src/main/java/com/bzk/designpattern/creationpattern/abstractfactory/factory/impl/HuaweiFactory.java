package com.bzk.designpattern.creationpattern.abstractfactory.factory.impl;

import com.bzk.designpattern.creationpattern.abstractfactory.factory.FactoryInterface;
import com.bzk.designpattern.creationpattern.abstractfactory.goods.Charger;
import com.bzk.designpattern.creationpattern.abstractfactory.goods.Phone;
import com.bzk.designpattern.creationpattern.abstractfactory.goods.impl.HuaweiChargerImpl;
import com.bzk.designpattern.creationpattern.abstractfactory.goods.impl.HuaweiPhoneImpl;

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
