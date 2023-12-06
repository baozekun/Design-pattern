package com.bzk.designpattern.abstractfactory.factory.impl;

import com.bzk.designpattern.abstractfactory.factory.FactoryInterface;
import com.bzk.designpattern.abstractfactory.goods.Charger;
import com.bzk.designpattern.abstractfactory.goods.Phone;
import com.bzk.designpattern.abstractfactory.goods.impl.IPhoneChargerImpl;
import com.bzk.designpattern.abstractfactory.goods.impl.IPhonePhoneImpl;

public class IPhoneFactory implements FactoryInterface {
    @Override
    public Phone getPhone() {
        return new IPhonePhoneImpl();
    }

    @Override
    public Charger getCharger() {
        return new IPhoneChargerImpl();
    }
}
