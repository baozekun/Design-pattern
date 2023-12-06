package com.bzk.designpattern.simplefactory;

import com.bzk.designpattern.simplefactory.abstractFather.abstractclassimpl.EmailAbstract;
import com.bzk.designpattern.simplefactory.impl.GoogleEmailImpl;
import com.bzk.designpattern.simplefactory.impl.TencentEmailImpl;
import com.bzk.designpattern.simplefactory.impl.WangYiEmailImpl;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class FactoryClient {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        EmailSimpleFactory instance = EmailSimpleFactory.getInstance();
        log.info("单方法工厂模式");
        log.info("==较为繁琐的映射方式(不满足开闭原则，修改繁琐，但是支持多种复杂功能，能更好的践行简单工厂模式的使用)");
        EmailAbstract emailTencent = instance.getEmailClient("tencentEmail");
        emailTencent.send("Tencent");
        EmailAbstract emailWangYi = instance.getEmailClient("wangYiEmail");
        emailWangYi.send("WangYi");
        EmailAbstract emailGoogle = instance.getEmailClient("googleEmail");
        emailGoogle.send("Google");
        log.info("==修改之后利用反射的方式（满足开闭原则，反射效率低，而且调用的是实现类的无参构造，无法支持对有参构造进行初始化，功能复杂之后不能很好支持）");
        EmailAbstract emailTencent1 = instance.getEmailClient(TencentEmailImpl.class);
        emailTencent1.send("Tencent");
        EmailAbstract emailWangYi1 = instance.getEmailClient(WangYiEmailImpl.class);
        emailWangYi1.send("WangYi");
        EmailAbstract emailGoogle1 = instance.getEmailClient(GoogleEmailImpl.class);
        emailGoogle1.send("Google");
        log.info("多方法工厂模式");
        log.info("==抽象父类或者接口中为每一个子类维护一个（或多个）专属方法");
        log.info("==java.util.concurrent.Executors采用多方法静态工厂模式来初始化线程池，多方法工厂的优势即方便创建同种类型的复杂参数对象");
        EmailAbstract emailTencent2 = instance.getEmailClient("tencentEmail");
        emailTencent2.sendTencent("Tencent");
        EmailAbstract emailWangYi2 = instance.getEmailClient("wangYiEmail");
        emailWangYi2.sendWangYi("WangYi");
        EmailAbstract emailGoogle2 = instance.getEmailClient("googleEmail");
        emailGoogle2.sendGoogle("Google");
    }
}
