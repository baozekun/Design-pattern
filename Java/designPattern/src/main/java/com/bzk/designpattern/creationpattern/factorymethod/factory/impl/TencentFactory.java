package com.bzk.designpattern.creationpattern.factorymethod.factory.impl;

import com.bzk.designpattern.creationpattern.factorymethod.email.abstractFather.abstractclassimpl.EmailAbstract;
import com.bzk.designpattern.creationpattern.factorymethod.email.impl.TencentEmailImpl;
import com.bzk.designpattern.creationpattern.factorymethod.factory.EmailFactory;

public class TencentFactory  implements EmailFactory {
    @Override
    public EmailAbstract getEmailProvider() {
        return new TencentEmailImpl();
    }
}
