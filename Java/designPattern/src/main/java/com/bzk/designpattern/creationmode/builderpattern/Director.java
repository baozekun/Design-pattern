package com.bzk.designpattern.creationmode.builderpattern;

import com.bzk.designpattern.creationmode.builderpattern.bean.AComplexProduct;
import com.bzk.designpattern.creationmode.builderpattern.builder.Builder;
import lombok.Data;

@Data
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public AComplexProduct build(){
        builder.dealWith1();
        builder.dealWith2();
        builder.dealWith3();
        builder.dealWith4();
        return builder.getResult();
    }
}
