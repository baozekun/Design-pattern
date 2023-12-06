package com.bzk.designpattern.creationmode.factorymethod.factory.impl;

import com.bzk.designpattern.creationmode.factorymethod.email.abstractFather.abstractclassimpl.EmailAbstract;
import com.bzk.designpattern.creationmode.factorymethod.email.impl.GoogleEmailImpl;
import com.bzk.designpattern.creationmode.factorymethod.factory.EmailFactory;

public class GoogleFactory  implements EmailFactory {

    @Override
    public EmailAbstract getEmailProvider() {
        return new GoogleEmailImpl();
    }
}
