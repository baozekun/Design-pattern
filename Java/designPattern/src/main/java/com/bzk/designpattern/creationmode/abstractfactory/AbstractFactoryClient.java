package com.bzk.designpattern.creationmode.abstractfactory;

import com.bzk.designpattern.creationmode.abstractfactory.factory.FactoryInterface;
import com.bzk.designpattern.creationmode.abstractfactory.factory.impl.HuaweiFactory;
import com.bzk.designpattern.creationmode.abstractfactory.factory.impl.IPhoneFactory;
import com.bzk.designpattern.creationmode.abstractfactory.goods.Charger;
import com.bzk.designpattern.creationmode.abstractfactory.goods.Phone;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        FactoryInterface iPhoneFactory = new IPhoneFactory();
        Phone phone = iPhoneFactory.getPhone();
        phone.call();
        Charger charger = iPhoneFactory.getCharger();
        charger.charge();
        FactoryInterface huaweiFactory = new HuaweiFactory();
        Phone phone1 = huaweiFactory.getPhone();
        phone1.call();
        Charger charger1 = huaweiFactory.getCharger();
        charger1.charge();
    }
}
