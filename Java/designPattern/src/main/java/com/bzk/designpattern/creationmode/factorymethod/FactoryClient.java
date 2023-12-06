package com.bzk.designpattern.creationmode.factorymethod;

import com.bzk.designpattern.creationmode.factorymethod.email.abstractFather.abstractclassimpl.EmailAbstract;
import com.bzk.designpattern.creationmode.factorymethod.factory.EmailFactory;
import com.bzk.designpattern.creationmode.factorymethod.factory.impl.GoogleFactory;
import com.bzk.designpattern.creationmode.factorymethod.factory.impl.TencentFactory;
import com.bzk.designpattern.creationmode.factorymethod.factory.impl.WangYiFactory;

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
