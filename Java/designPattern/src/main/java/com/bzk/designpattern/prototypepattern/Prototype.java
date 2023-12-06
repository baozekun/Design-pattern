package com.bzk.designpattern.prototypepattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Prototype implements Cloneable {

    private Integer id;
    private String name;
    private Map<String,Double> map;

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        //浅拷贝方式
        Prototype prototype = (Prototype) super.clone();
        //深拷贝方式：对每一个复杂类型分别进行克隆
        //测试浅拷贝的时候注释下面代码
        prototype.map = (Map<String, Double>) ((HashMap)this.map).clone();
        return prototype;
    }
}
