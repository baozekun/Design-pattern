package com.bzk.designpattern.structuralmode.flyweight;

import com.bzk.designpattern.structuralmode.flyweight.actorimpl.Liyifeng;
import com.bzk.designpattern.structuralmode.flyweight.actorimpl.Wuqian;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
@Slf4j
public class ActorFactory {

    public static Map<String,Actor> actorMap = new HashMap<>();

    public static Actor getActor(String name){
        Actor actor;
        if(actorMap.containsKey(name)){
            actor = actorMap.get(name);
        } else {
            if("Wuqian".equals(name)){
                actor = new Wuqian(true, false, true);
            } else if ("Liyifeng".equals(name)){
                actor = new Liyifeng(false, true, false);
            } else {
                log.info("没有这号人");
                actor = null;
            }
        }
        return actor;
    }
}
