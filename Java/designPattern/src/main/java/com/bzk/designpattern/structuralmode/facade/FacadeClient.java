package com.bzk.designpattern.structuralmode.facade;

public class FacadeClient {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.getSystemInfo();
    }
}
