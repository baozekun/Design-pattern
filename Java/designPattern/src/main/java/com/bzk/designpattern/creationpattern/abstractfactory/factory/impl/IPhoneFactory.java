package com.bzk.designpattern.creationpattern.abstractfactory.factory.impl;

import com.bzk.designpattern.creationpattern.abstractfactory.factory.FactoryInterface;
import com.bzk.designpattern.creationpattern.abstractfactory.goods.Charger;
import com.bzk.designpattern.creationpattern.abstractfactory.goods.Phone;
import com.bzk.designpattern.creationpattern.abstractfactory.goods.impl.IPhoneChargerImpl;
import com.bzk.designpattern.creationpattern.abstractfactory.goods.impl.IPhonePhoneImpl;

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
