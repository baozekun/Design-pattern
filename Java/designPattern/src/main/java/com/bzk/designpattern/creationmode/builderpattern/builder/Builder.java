package com.bzk.designpattern.creationmode.builderpattern.builder;

import com.bzk.designpattern.creationmode.builderpattern.bean.AComplexProduct;

public abstract class Builder {
    protected AComplexProduct aComplexProduct = new AComplexProduct();

    public abstract void dealWith1();

    public abstract void dealWith2();

    public abstract void dealWith3();

    public abstract void dealWith4();

    public AComplexProduct getResult(){
        return aComplexProduct;
    }

}
