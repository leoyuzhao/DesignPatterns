package com.yzf.study.structural.decorative_pattern;

/**
 * @description: 饮料抽象类
 * @author leo
 * @date 2023/8/13 15:27
 * @version 1.0
 */
public abstract class Beverage {

    public String description;

    public  String getDescription(){
        return this.description;
    }

    public abstract Double cost();

}
