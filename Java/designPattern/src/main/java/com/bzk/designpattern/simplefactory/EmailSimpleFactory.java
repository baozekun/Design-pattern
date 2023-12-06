package com.bzk.designpattern.simplefactory;

import com.bzk.designpattern.simplefactory.abstractFather.abstractclassimpl.EmailAbstract;
import com.bzk.designpattern.simplefactory.impl.GoogleEmailImpl;
import com.bzk.designpattern.simplefactory.impl.TencentEmailImpl;
import com.bzk.designpattern.simplefactory.impl.WangYiEmailImpl;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class EmailSimpleFactory {

    private static EmailSimpleFactory INSTANCE;

    public static Map<String,EmailAbstract> FACTORY_MAP = new HashMap<>();

    static {
        FACTORY_MAP.put("tencentEmail",new TencentEmailImpl());
        FACTORY_MAP.put("wangYiEmail",new WangYiEmailImpl());
        FACTORY_MAP.put("googleEmail",new GoogleEmailImpl());
    }

    private EmailSimpleFactory() {
    }
    
    public static EmailSimpleFactory getInstance(){
        synchronized (EmailSimpleFactory.class) {
            if(null == INSTANCE){
                INSTANCE = new EmailSimpleFactory();
            }
        }
        return INSTANCE;
    }

    public EmailAbstract getEmailClient(String emailField){
        return FACTORY_MAP.get(emailField);
    }

    public EmailAbstract getEmailClient(Class clazz) throws InstantiationException, IllegalAccessException {
        //Class.forName(clazz.getName()).newInstance()
        EmailAbstract emailClient = (EmailAbstract) clazz.newInstance();
        return emailClient;
    }
}
