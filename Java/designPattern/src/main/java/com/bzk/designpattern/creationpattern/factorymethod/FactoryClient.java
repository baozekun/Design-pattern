package com.bzk.designpattern.creationpattern.factorymethod;

import com.bzk.designpattern.creationpattern.factorymethod.email.abstractFather.abstractclassimpl.EmailAbstract;
import com.bzk.designpattern.creationpattern.factorymethod.factory.EmailFactory;
import com.bzk.designpattern.creationpattern.factorymethod.factory.impl.GoogleFactory;
import com.bzk.designpattern.creationpattern.factorymethod.factory.impl.TencentFactory;
import com.bzk.designpattern.creationpattern.factorymethod.factory.impl.WangYiFactory;

public class FactoryClient {
    public static void main(String[] args) {
        EmailFactory emailGoogleFactory = new GoogleFactory();
        EmailFactory emailTencentFactory = new TencentFactory();
        EmailFactory emailWangYiFactory = new WangYiFactory();

        EmailAbstract emailTencent = emailTencentFactory.getEmailProvider();
        EmailAbstract emailWangYi = emailWangYiFactory.getEmailProvider();
        EmailAbstract emailGoogle = emailGoogleFactory.getEmailProvider();

        emailTencent.sendTencent("Tencent");
        emailWangYi.sendWangYi("WangYi");
        emailGoogle.sendGoogle("Google");
    }
}
