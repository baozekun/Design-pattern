package com.bzk.designpattern.structuralmode.facade;

import com.bzk.designpattern.structuralmode.facade.subservice.Cache;
import com.bzk.designpattern.structuralmode.facade.subservice.Cpu;
import com.bzk.designpattern.structuralmode.facade.subservice.VideoCard;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Facade {



    public void getSystemInfo(){
        Cpu cpu = new Cpu();
        Cache cache = new Cache();
        VideoCard videoCard = new VideoCard();
        log.info("System info is ");
        cpu.getCpu();
        cache.getCache();
        videoCard.getVideoCard();
    }
}
