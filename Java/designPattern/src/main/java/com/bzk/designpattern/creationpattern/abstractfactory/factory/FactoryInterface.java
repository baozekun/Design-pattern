package com.bzk.designpattern.creationpattern.abstractfactory.factory;

import com.bzk.designpattern.creationpattern.abstractfactory.goods.Charger;
import com.bzk.designpattern.creationpattern.abstractfactory.goods.Phone;

public interface FactoryInterface {
    Phone getPhone();
    Charger getCharger();
}
