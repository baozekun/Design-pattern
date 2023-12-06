package com.bzk.designpattern.creationmode.factorymethod.factory;

import com.bzk.designpattern.creationmode.factorymethod.email.abstractFather.abstractclassimpl.EmailAbstract;

public interface EmailFactory {

    EmailAbstract getEmailProvider();
}
