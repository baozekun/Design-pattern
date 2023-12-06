package com.bzk.designpattern.creationpattern.factorymethod.factory.impl;

import com.bzk.designpattern.creationpattern.factorymethod.email.abstractFather.abstractclassimpl.EmailAbstract;
import com.bzk.designpattern.creationpattern.factorymethod.email.impl.GoogleEmailImpl;
import com.bzk.designpattern.creationpattern.factorymethod.factory.EmailFactory;

public class GoogleFactory  implements EmailFactory {

    @Override
    public EmailAbstract getEmailProvider() {
        return new GoogleEmailImpl();
    }
}
