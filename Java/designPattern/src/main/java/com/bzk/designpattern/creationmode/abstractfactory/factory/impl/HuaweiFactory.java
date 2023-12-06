package com.bzk.designpattern.creationmode.abstractfactory.factory.impl;

import com.bzk.designpattern.creationmode.abstractfactory.factory.FactoryInterface;
import com.bzk.designpattern.creationmode.abstractfactory.goods.Charger;
import com.bzk.designpattern.creationmode.abstractfactory.goods.Phone;
import com.bzk.designpattern.creationmode.abstractfactory.goods.impl.HuaweiChargerImpl;
import com.bzk.designpattern.creationmode.abstractfactory.goods.impl.HuaweiPhoneImpl;

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
