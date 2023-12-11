package com.bzk.designpattern.structuralmode.flyweight;

public class FlyWeightClient {
    public static void main(String[] args) {
        Actor wuqian = ActorFactory.getActor("Wuqian");
        wuqian.show();
        Actor liyifeng = ActorFactory.getActor("Liyifeng");
        liyifeng.show();
    }
}
