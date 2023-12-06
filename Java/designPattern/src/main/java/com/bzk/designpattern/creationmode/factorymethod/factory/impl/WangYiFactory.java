package com.bzk.designpattern.creationmode.factorymethod.factory.impl;

import com.bzk.designpattern.creationmode.factorymethod.email.abstractFather.abstractclassimpl.EmailAbstract;
import com.bzk.designpattern.creationmode.factorymethod.email.impl.WangYiEmailImpl;
import com.bzk.designpattern.creationmode.factorymethod.factory.EmailFactory;

public class WangYiFactory implements EmailFactory {
    @Override
    public EmailAbstract getEmailProvider() {
        return new WangYiEmailImpl();
    }
}
