package com.bzk.designpattern.builderpattern;

import com.bzk.designpattern.builderpattern.bean.AComplexProduct;
import com.bzk.designpattern.builderpattern.builder.Builder;
import com.bzk.designpattern.builderpattern.builder.impl.BuilderImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderClient {
    public static void main(String[] args) {
        Builder builder = new BuilderImpl();
        Director director = new Director(builder);
        AComplexProduct build = director.build();
        log.info(build.toString());
    }
}
