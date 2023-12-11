package com.bzk.designpattern.behaviorandtemplatemode.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * 观察者实现
 */
@Slf4j
public class ObserverImpl implements Observer{
    @Override
    public void update(int i) {
        log.info("我这里将{}进行了更新",i);
    }
}
