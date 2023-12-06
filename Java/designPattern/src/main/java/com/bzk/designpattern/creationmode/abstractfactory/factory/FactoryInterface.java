package com.bzk.designpattern.creationmode.abstractfactory.factory;

import com.bzk.designpattern.creationmode.abstractfactory.goods.Charger;
import com.bzk.designpattern.creationmode.abstractfactory.goods.Phone;

public interface FactoryInterface {
    Phone getPhone();
    Charger getCharger();
}
