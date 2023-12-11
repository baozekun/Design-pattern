package com.bzk.designpattern.structuralmode.proxy.dynamicproxy.cglibdynamicproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserServiceImpl implements IUserService{
    @Override
    public void userSay() {
        log.info("I say hello!");
    }
}
