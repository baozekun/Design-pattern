package com.bzk.designpattern.builderpattern.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AComplexProduct {
    //成员可以是任意类型
    private String part1;
    private String part2;
    private String part3;
    private String part4;

}
