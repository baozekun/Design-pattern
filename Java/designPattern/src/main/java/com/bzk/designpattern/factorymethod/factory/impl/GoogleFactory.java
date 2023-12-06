package com.bzk.designpattern.factorymethod.factory.impl;

import com.bzk.designpattern.factorymethod.email.abstractFather.abstractclassimpl.EmailAbstract;
import com.bzk.designpattern.factorymethod.email.impl.GoogleEmailImpl;
import com.bzk.designpattern.factorymethod.factory.EmailFactory;

public class GoogleFactory  implements EmailFactory {

    @Override
    public EmailAbstract getEmailProvider() {
        return new GoogleEmailImpl();
    }
}
