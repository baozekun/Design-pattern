package com.bzk.designpattern.factorymethod;

import com.bzk.designpattern.factorymethod.email.abstractFather.abstractclassimpl.EmailAbstract;
import com.bzk.designpattern.factorymethod.factory.EmailFactory;
import com.bzk.designpattern.factorymethod.factory.impl.GoogleFactory;
import com.bzk.designpattern.factorymethod.factory.impl.TencentFactory;
import com.bzk.designpattern.factorymethod.factory.impl.WangYiFactory;

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
