package com.bzk.designpattern.abstractfactory.factory;

import com.bzk.designpattern.abstractfactory.goods.Charger;
import com.bzk.designpattern.abstractfactory.goods.Phone;

public interface FactoryInterface {
    Phone getPhone();
    Charger getCharger();
}
