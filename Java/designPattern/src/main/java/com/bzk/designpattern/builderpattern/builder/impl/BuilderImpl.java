package com.bzk.designpattern.builderpattern.builder.impl;

import com.bzk.designpattern.builderpattern.builder.Builder;

public class BuilderImpl extends Builder {

    @Override
    public void dealWith1() {
        aComplexProduct.setPart1("part1");
    }

    @Override
    public void dealWith2() {
        aComplexProduct.setPart2("part2");
    }

    @Override
    public void dealWith3() {
        aComplexProduct.setPart3("part3");
    }

    @Override
    public void dealWith4() {
        aComplexProduct.setPart4("part4");
    }
}
