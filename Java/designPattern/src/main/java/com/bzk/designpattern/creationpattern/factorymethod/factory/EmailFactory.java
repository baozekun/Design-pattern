package com.bzk.designpattern.creationpattern.factorymethod.factory;

import com.bzk.designpattern.creationpattern.factorymethod.email.abstractFather.abstractclassimpl.EmailAbstract;

public interface EmailFactory {

    EmailAbstract getEmailProvider();
}
