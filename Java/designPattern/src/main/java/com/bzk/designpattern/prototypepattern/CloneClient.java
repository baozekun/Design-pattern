package com.bzk.designpattern.prototypepattern;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class CloneClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Map<String,Double> map = new HashMap<>();
        map.put("score",115.5);
        Prototype prototype = new Prototype(1,"HaHa",map);
        prototype.setMap(map);
        Prototype clone = prototype.clone();
        Map<String, Double> map1 = clone.getMap();
        map1.put("score",120.5);
        log.info(prototype.toString());
        log.info(clone.toString());
    }
}
