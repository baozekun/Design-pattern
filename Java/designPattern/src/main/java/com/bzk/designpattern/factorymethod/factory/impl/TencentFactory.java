package com.bzk.designpattern.factorymethod.factory.impl;

import com.bzk.designpattern.factorymethod.email.abstractFather.abstractclassimpl.EmailAbstract;
import com.bzk.designpattern.factorymethod.email.impl.TencentEmailImpl;
import com.bzk.designpattern.factorymethod.factory.EmailFactory;

public class TencentFactory  implements EmailFactory {
    @Override
    public EmailAbstract getEmailProvider() {
        return new TencentEmailImpl();
    }
}
