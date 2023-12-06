package com.bzk.designpattern.factorymethod.factory;

import com.bzk.designpattern.factorymethod.email.abstractFather.abstractclassimpl.EmailAbstract;

public interface EmailFactory {

    EmailAbstract getEmailProvider();
}
