package com.bzk.designpattern.structuralmode.facade.subservice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VideoCard {

    private final String VIDEO_CARD = "4090Ti";

    public void getVideoCard(){
        log.info("Video card is {}",VIDEO_CARD);
    }
}
